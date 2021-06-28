import java.util.*;
import java.lang.*;
import java.io.*;

class DetectCycleUndirected
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
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends





class Solution
{
    public static boolean dfs(int index, boolean visit[],int parent, ArrayList<ArrayList<Integer>> adj){
        if(visit[index]){
            return true;
        }
        
        visit[index] = true;
        for(int i = 0; i < adj.get(index).size(); i++){
            if(!visit[adj.get(index).get(i)]){
                if (dfs(adj.get(index).get(i), visit, index, adj)){
                    return true;
                }
                 
            }
            else if(adj.get(index).get(i) != parent){
                return true;
            }
        }
       
        return false;
    }
    
    
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        // System.out.println(V);
        // System.out.println(adj);
        boolean visit[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!visit[i]){
                if(dfs(i, visit, -1, adj)){
                    return true;
                }
            }
        }
        return false;
    }
}