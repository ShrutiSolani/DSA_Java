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
        static int isPlaindrome(String S1, int start, int end) {
        // code here
        String S2 = S1.substring(start, end+1);
        char[] S = S2.toCharArray();
        int n = S.length;
        if(n % 2 == 0){
            for(int i = 0;i <= n/2; i++){
                if(S[i] != S[n - 1 - i]){
                    return 0;
                }
            }
            return 1;
        }
        else{
            int x = (int)n/2;
            for(int i = 0;i <= x; i++){
                if(S[i] != S[n-1-i]){
                    return 0;
                }
            }
            return 1;
        }
    }
    
    static String longestPalin(String S){
        // code here
        int local_start = 0;
        int local_end = 0;
        int max_len = 0;
        int local_len = 0;
        for(int i = 0; i < S.length(); i++){
            for(int j = i; j < S.length(); j++){
                if(j == i){
                    local_len = 1;
                    if(local_len > max_len){
                        max_len = local_len;
                        local_start = i;
                        local_end = j;
                    }
                }
                else{
                    // System.out.println(i+" "+j);
                    int x = isPlaindrome(S, i, j);
                    if(x == 1){
                        // System.out.println("x=1 - "+i+" "+j);
                        local_len = j - i + 1;
                        // System.out.println("local - "+ local_len);
                        if(local_len > max_len){
                            max_len = local_len;
                            // System.out.println("max - "+max_len);
                            local_start = i;
                            local_end = j;
                    }
                }
            }
        }
        
    }
    return S.substring(local_start, local_end+1);
    } 
}