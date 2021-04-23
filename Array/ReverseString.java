//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class ReverseString
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int j = 0;
        int n = str.length();
        StringBuilder str1 = new StringBuilder("");
        for(int i = n-1;i >= 0;i--){
            str1.append(str.charAt(i));
        }
        return str1.toString();
        // Reverse the string str
    }
}