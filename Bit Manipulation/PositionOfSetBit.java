//Initial Template for Java

import java.io.*;
import java.util.*;

class PositionOfSetBit {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    // Approach 1
    // static int findPosition(int N) {
    //     // code here
    //     String bin = Integer.toBinaryString(N);
    //     int pos, i;
    //     int count = 0;
    //     int set_position = 0;
    //     int n = bin.length();
    //     for(i = n-1; i >= 0;i--){
    //         pos = n-i;
    //         if(bin.charAt(i) == '1'){
    //             count ++;
    //             if(count > 1){
    //                 return -1;
    //             }
    //             set_position = pos;
    //         }
    //     }
    //     if(count == 0){
    //         return -1;
    //     }
    //     else{
    //         return set_position;
    //     }
    // }

    // Approach 2
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n == 0){
            return false;
        }
        else{
            if((n & (n-1)) == 0){
                return true;
            }
            return false;
        }
        
    }
    
    
    static int findPosition(int N) {
        // code here
        
        
        if(!isPowerofTwo((long)N)){
            return -1;
        }
        String bin = Integer.toBinaryString(N);
        int pos, i;
        // int count = 0;
        int set_position = 0;
        int n = bin.length();
        for(i = n-1; i >= 0;i--){
            pos = n-i;
            if(bin.charAt(i) == '1'){
                set_position = pos;
            }
        }
        return set_position;
    }
};