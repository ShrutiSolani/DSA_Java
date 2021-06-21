// Initial Template for Java
import java.io.*;
import java.util.*;

class NumberOf1 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        int count = 0;
        String str = Integer.toBinaryString(N);
        char find = '1';
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) == find){
                count ++;
            }
        }
        return count;
    }
}