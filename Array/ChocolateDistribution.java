//Initial Template for Java

import java.io.*;
import java.util.*;
class ChocolateDistribution
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long mindiff = Long.MAX_VALUE;
        for(int i = 0;i <= (int)n - (int)m;i++){
          
            long diff = a.get(i+ (int)m - 1) - a.get(i); 
            mindiff = Math.min(mindiff, diff);
        }
        return mindiff;
    }
}