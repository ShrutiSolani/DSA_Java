
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long curr = 0;
        long max_sum = Long.MIN_VALUE;
        for(int i = 0;i < arr.length; i++){
            curr += arr[i];
            max_sum = Math.max(max_sum, curr);
            if(curr < 0){
                curr = 0;
            }
        }
        if(max_sum < 0){
            return 0;
        }
        return max_sum;
	}

}
