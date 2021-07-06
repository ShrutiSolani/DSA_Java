
import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    
    
    private int getCountLessOrEqual(int[][] matrix, int val, int n) {
        int i = 0, j = n - 1;
        int res = 0;
        while (i < n) {
            while (j >= 0 && matrix[i][j] > val) j--;
            res += j + 1;
            i++;
        }
        return res;
    }
    
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        int low = mat[0][0];
        int high = mat[n-1][n-1];
        int mid;
        Solution obj = new Solution();
        while(low <= high){
            mid = low + (high - low)/2;
            int count = obj.getCountLessOrEqual(mat, mid, n);
            if(count < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}