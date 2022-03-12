
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        if(arr.length == 0){
            return (long)0;
        }
        else{
            long currSum = 0;
            long maxSum = 0;
            for(int i = 0;i < arr.length;i++){
                currSum = currSum + (long)arr[i];
                maxSum = Math.max(currSum, maxSum);
                if(currSum < 0){
                    currSum = (long)0;
                }
            }
            return maxSum;
        }
	}

}
