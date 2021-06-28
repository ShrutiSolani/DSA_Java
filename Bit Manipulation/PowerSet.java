//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class PowerSet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        int n = (1 << s.length()) - 1;
        // System.out.println(n);
        List<String> a = new ArrayList<String>();
        
        for(int i = 1; i <= n; i++){
            // String x = Integer.toBinaryString(i);
            String x = "";
            for(int j = 0; j < s.length(); j++){
                if((i & (1<<j)) != 0){
                    x = x + s.charAt(j);
                }
            }
            a.add(x);
        }
        
        Collections.sort(a);
        return a;
    }
}