//Initial Template for Java
import java.io.*;
import java.util.*;

class CopySetBits{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        if(l < 1 || r > 32){
            return -1;
        }
        
        int mask = (1 << (r-l+1));
        mask--;
        mask = (mask << (l - 1));
        mask = mask & y;
        x = x | mask;
        return x; 
    }
}