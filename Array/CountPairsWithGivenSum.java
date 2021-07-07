//Initial Template for Java

import java.io.*;
import java.util.*;

public class CountPairsWithGivenSum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i = 0;i < n;i++){
            if(freq.get(arr[i]) == null){
                freq.put(arr[i], 1);
            }
            else{
                int x = freq.get(arr[i]);
                freq.put(arr[i], x+1);
            }
        }
 
        int count = 0;
        for(int i = 0;i < n;i++){
            if(freq.get(k - arr[i]) != null){
                count += freq.get(k - arr[i]);
            }
            if((k - arr[i]) == arr[i]){
                count --;
            }
        }
        return count/2;
    }
}
