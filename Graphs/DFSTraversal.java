// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class DFSTraversal
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
            ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.dfsOfGraph(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends





class Solution
{
     private void dfs(int ch, boolean[] vis, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj)
    {
        //marking vertex as visited and adding it to output list.
        vis[ch] = true;
        ans.add(ch);
        
        //iterating over connected components of the vertex and if any 
	    //of them is not visited then calling the function recursively.
        for(int i = 0; i < adj.get(ch).size(); i++)
            if(!vis[adj.get(ch).get(i)])
                dfs(adj.get(ch).get(i), vis, ans, adj);
    }
    
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        //using a boolean list to mark all the vertices as not visited.
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<Integer>();
	    dfs(0, vis, ans, adj);
	    
	    //returning the output list.
	    return ans;
    }
}