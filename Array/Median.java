import java.util.*;
import java.lang.*;
import java.io.*;
class Median
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
            int[] v  = new int[n];
            for(int  i = 0; i < n; i++)
                v[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.find_median(v);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int n = v.length;
        if(n % 2 == 0){
            int x = (int)n/2;
            int y = x - 1;
            int a = (int)(v[x]+v[y])/2;
            return(a);
        }
        else{
            return(v[(int)n/2]);
        }
    }
}