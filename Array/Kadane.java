// { Driver Code Starts
import java.io.*;

class Kadane {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{

    int max(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++ ){
            local_max = max(arr[i], arr[i] + local_max);
            if(local_max > global_max){
                global_max = local_max;
            }
        }
        return global_max;
    }
    
}
