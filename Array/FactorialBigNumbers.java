//Initial Template for Java

import java.io.*;
import java.util.*;

class FactorialBigNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int multiply(int x, ArrayList<Integer> a, int size){
        int carry = 0, ans;
        for(int i = 0;i < size;i++){
            ans = x*a.get(i) + carry;
            a.set(i, ans%10);
            carry = ans/10;
        }
        while(carry != 0){
            a.add(carry%10);
            carry = carry/10;
            size++;
        }
        return size;
    }
    
    
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(1);
        int size = 1;
        for(int i = 2;i <= N; i++){
            size = multiply(i, a, size);
        }
        ArrayList<Integer> b = new ArrayList<Integer>(a.subList(0, size));
        return b;
        
    }
}