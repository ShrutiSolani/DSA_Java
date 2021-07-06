/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class CommonElementsInAllRows {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i,j;
		int matrix[][] = new int[m][n];
		for(i = 0;i < m;i++){
		    for(j = 0;j < n;j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		Solution obj = new Solution();
		obj.Common(matrix, m, n);
	}
}

class Solution{
    public static void Common(int mat[][], int m, int n){
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0;i < n;i++){
            hm.put(mat[0][i], 1);
        }
        for(int i = 1;i < m;i++){
            for(int j = 0;j < n;j++){
                if(hm.get(mat[i][j]) != null && hm.get(mat[i][j]) == i){
                    hm.put(mat[i][j], i+1);
                }
            }
        }
        for( Map.Entry<Integer, Integer> entry : hm.entrySet() ){
            if(entry.getValue() == m){
                System.out.println( entry.getKey());
            }
        }
    }
}