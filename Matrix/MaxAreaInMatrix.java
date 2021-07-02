import java.util.*;

class MaxAreaInMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public static int getMaxArea(int hist[], int n) 
    {
        // your code here
        int right[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        right[n-1] = n;
        for(int i = n-2;i >= 0;i--){
            while(st.size() > 0 && hist[i] <= hist[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                right[i] = n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }
        
        
        
        int left[] = new int[n];
        st = new Stack<>();
        st.push(0);
        left[0] = -1;
        for(int i = 1;i < n;i++){
            while(st.size() > 0 && hist[i] < hist[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                left[i] = -1;
            }
            else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        
        
        
        int varmaxArea = 0;
        for(int i = 0;i < n; i++){
            int width = right[i] - left[i] - 1;
            int area = width*hist[i];
            varmaxArea = Math.max(varmaxArea, area);
        }
        return varmaxArea;
    }
    
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int height[] = new int[m];
        height = M[0];
        int max_area = Solution.getMaxArea(height, m);
        for(int i = 1;i < n;i++){
            for(int j = 0; j < m; j++){
                if(M[i][j] == 1){
                    height[j]++;
                }
                else{
                    height[j] = 0;
                }
            }
            max_area = Math.max(max_area, Solution.getMaxArea(height, m));
        }
        return max_area;
    }
}