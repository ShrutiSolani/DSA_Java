// Initial Template for Java

import java.io.*;
import java.util.*;

class SortMatrix {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int v[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < N; j++) v[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            int ans[][] = ob.sortedMatrix(N, v);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}
// Driver Code Ends


// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        // ArrayList<Integer> a = new ArrayList<Integer>();
        int a[] = new int[N*N];
        int i,j;
        int index = 0; 
        for(i = 0;i < N;i++){
            for(j = 0;j < N;j++){
                // a.add(Mat[i][j]);
                a[index] = Mat[i][j];
                index ++;
            }
        }
        Arrays.sort(a);
        index = 0;
        for(i = 0;i < N;i++){
            for(j = 0;j < N;j++){
                Mat[i][j] = a[index];
                index++;
            }
        }
        return Mat;
    }
}