//Initial Template for Java

import java.io.*;
import java.util.*;
class LongestPalindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static Boolean isPalin(String s){
        int n = s.length();
        int j = n-1;
        for(int i = 0; i < n/2;i++){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    static String longestPalin(String S){
        // code here
        int n = S.length();
        int i,j;
        int max_len = 0;
        String a = "";
        Boolean flag=false;
        for(i = 0;i < n;i++){
            for(j = i+1;j < n;j++){
                Boolean x = isPalin(S.substring(i,j+1));
                if(x == true){
                    // System.out.println("i - "+i);
                    // System.out.println("j - "+j);
                    if((j-i) > max_len){
                        max_len = (j-i);
                        a = S.substring(i,j+1);
                    }
                    // System.out.println(a);
                }
            }
           
        }
        if(a == ""){
            a = S.substring(0,1);
        }
        return a;
    }
}