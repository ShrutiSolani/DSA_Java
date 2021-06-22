import java.util.*;


class Graph<M>{
	private HashMap<M, List<M>> mygraph = new HashMap<M, List<M>>();

	// Graph obj = new Graph();
	public void addvertex(M v){
		mygraph.put(v, new LinkedList<M>());
	}

	public void addedge(M source, M destination){
		if(!mygraph.containsKey(source)){
			addvertex(source);
		}
		if(!mygraph.containsKey(destination)){
			addvertex(destination);
		}
		mygraph.get(source).add(destination);
		mygraph.get(destination).add(source);
	}

	public void display(){
		StringBuilder s = new StringBuilder();
		for(M i: mygraph.keySet()){
			System.out.print(i.toString()+ " : ");
			for(M j: mygraph.get(i)){
				System.out.print(j.toString() + "\t");
			}
			System.out.println();
		}
	}
}

class CreateGraph{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
		int edges = sc.nextInt();
		Graph g = new Graph<Integer>();
		for(int i = 0; i < edges; i++){
			int source = sc.nextInt();
			int dest = sc.nextInt();
			g.addedge(source, dest);
		}
		System.out.println("Graph : \n");
		g.display();
	}
}