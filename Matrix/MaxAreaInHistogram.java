import java.util.*;
import java.lang.*;
import java.io.*;

class MaxAreaInHistogram {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends




class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        int right[] = new int[(int)n];
        Stack<Integer> st = new Stack<>();
        st.push((int)n-1);
        right[(int)n-1] = (int)n;
        for(int i = (int)n-2;i >= 0;i--){
            while(st.size() > 0 && hist[i] <= hist[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                right[i] = (int)n;
            }
            else{
                right[i] = st.peek();
            }
            st.push(i);
        }
        
        
        
        int left[] = new int[(int)n];
        st = new Stack<>();
        st.push(0);
        left[0] = -1;
        for(int i = 1;i < (int)n;i++){
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
        
        
        
        long maxArea = 0;
        for(int i = 0;i < n; i++){
            int width = right[i] - left[i] - 1;
            long area = width*hist[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
        
}
