import java.util.*;
import java.lang.*;
import java.io.*;
class NumberOfIslands {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    static void dfs(char[][] grid, int r, int c, int[][] visited){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length){
            return;
        }
        
        if(grid[r][c] == '0'){
            return;
        }
        
        if(visited[r][c] == 0){
            visited[r][c] = 1;
            dfs(grid, r-1,c,visited);
            dfs(grid,r-1,c-1,visited);
            dfs(grid,r,c-1,visited);
            dfs(grid,r+1,c-1,visited);
            dfs(grid,r+1,c,visited);
            dfs(grid,r+1,c+1,visited);
            dfs(grid,r,c+1,visited);
            dfs(grid,r-1,c+1,visited);
        }
    }
    
    
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int count = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(visited[i][j] == 0 && grid[i][j] == '1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        
        return count;
    }
}
