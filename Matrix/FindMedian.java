//Initial Template for Java

import java.io.*;
import java.util.*;


class FindMedian
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        // code here    
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i, j;
        for(i = 0;i < r; i++){
            for(j = 0; j < c; j++){
                a.add(matrix[i][j]);
            }
        }
        Collections.sort(a);
        int n = a.size();
        return a.get((int)n/2);
    }
}