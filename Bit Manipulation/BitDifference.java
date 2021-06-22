//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int count = 0;
        int x = a^b;
        String strx = Integer.toBinaryString(x);
        char one = '1';
        for(int i = 0;i < strx.length(); i++){
            if(strx.charAt(i) == one){
                count++;
            }
        }
        return count;
    }
    
    
}


// { Driver Code Starts.

// Driver class
class BitDifference {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}

  // } Driver Code Ends