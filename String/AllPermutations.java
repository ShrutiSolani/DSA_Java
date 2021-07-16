import java.util.*;
import java.lang.*;
import java.io.*;
class AllPermutations
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    static String swap(char a[], int i, int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        String swappedString = new String(a);
        return swappedString;
    }
    public ArrayList<String> a = new ArrayList<String>();
    private void permute(String str, int l, int r)
    {
        if (l == r)
            a.add(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str.toCharArray(),l,i);
                permute(str, l+1, r);
                str = swap(str.toCharArray(),l,i);
            }
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        int n = S.length();
        permute(S,0,n-1);
        Collections.sort(a);
        return a;
    }
}