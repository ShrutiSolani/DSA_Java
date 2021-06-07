import java.io.*;
import java.util.*;

class Pallindrome {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPlaindrome(String S1) {
        // code here
        char[] S = S1.toCharArray();
        int n = S.length;
        if(n % 2 == 0){
            for(int i = 0;i <= n/2; i++){
                if(S[i] != S[n - 1 - i]){
                    return 0;
                }
            }
            return 1;
        }
        else{
            int x = (int)n/2;
            for(int i = 0;i <= x; i++){
                if(S[i] != S[n-1-i]){
                    return 0;
                }
            }
            return 1;
        }
    }
};