// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class BFSTraversal
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.bfsOfGraph(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends





class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //boolean list to mark all the vertices as not visited.
        boolean visited[] = new boolean[V];
        
        int s = 0;
        //initially we mark first vertex as visited(true).
        visited[s] = true;  
        
        ArrayList<Integer> res = new ArrayList<>();
        
        //creating a queue for BFS and pushing first vertex in queue.
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(s);
        
        while (q.size() != 0)
        {
            //adding front element in output list and popping it from queue.
            s = q.poll();
            res.add(s);

            //traversing over all the connected components of front element.
            Iterator<Integer> i = adj.get(s).listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                //if they aren't visited, we mark them visited and add to queue.
                if (!visited[n])
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        //returning the output list.
        return res;
    }
}