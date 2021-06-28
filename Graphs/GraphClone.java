/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, List<Node>> graph = new HashMap<Node, List<Node>>();
    
    public void traverse(Node node) {
        if(node == null){
            return;
        }
        if(graph.keySet().contains(node)){
            return;
        }
        graph.put(node, node.neighbors);
        for(Node n: node.neighbors){
            traverse(n);
        }
    }
    
    
    public Node cloneGraph(Node node) {
        // System.out.println(node.val);
        traverse(node);
        Map<Node, Node> map = new HashMap<Node, Node>();
        
        for(Node old : graph.keySet()){
            Node newNode = new Node(old.val);
            map.put(old, newNode);
        }
        
        for (Node old : graph.keySet()) {
            List<Node> newNeighbor = new ArrayList<Node>();
            for (Node oldNeighbor : graph.get(old)) {
                newNeighbor.add(map.get(oldNeighbor));
            }
            map.get(old).neighbors = newNeighbor;
        }
        return map.get(node);
        
    }
}