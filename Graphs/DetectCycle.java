import java.util.*;
import java.io.*;
import java.lang.*;

class DetectCycle
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution 
{
    public static boolean dfs(int index, boolean visit[], boolean recstack[], ArrayList<ArrayList<Integer>> adj){
        if(recstack[index]){
            return true;
        }
        
        if(visit[index]){
            return false;
        }
        
        visit[index] = true;
        recstack[index] = true;
        List<Integer> children = adj.get(index);
         
        for (Integer c: children)
            if (dfs(c, visit, recstack, adj))
                return true;
      
        recstack[index] = false;
        return false;
        
    }

    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        // System.out.println(V);
        // System.out.println(adj.toString());
        boolean visit[] = new boolean[V];
        boolean recstack[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(dfs(i, visit, recstack, adj)){
                return true;
            }
        }
        return false;
    }
}