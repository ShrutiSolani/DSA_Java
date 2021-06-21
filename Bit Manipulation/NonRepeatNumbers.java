
import java.util.*;
import java.lang.*;
import java.io.*;
class NonRepeatNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int xxory = 0;
        for(int i: nums){
            xxory = xxory ^ i;
        }
        
        int rightset = xxory & -xxory;
        int x = 0;
        int y = 0;
        for(int i: nums){
            if((i & rightset) == 0){
                x = x ^ i;
            }
            else{
                y = y ^ i;
            }
        }
        int norepeat[] = new int[2];
        if(x < y){
            norepeat[0] = x;
            norepeat[1] = y;
            return norepeat;
        }
        else{
            norepeat[0] = y;
            norepeat[1] = x;
            return norepeat;
        }
    }
}