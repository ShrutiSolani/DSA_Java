import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long currentSum = 0;
		long maxSum = Long.MIN_VALUE;

		for(int num : arr){
		    currentSum = currentSum + num;
		    maxSum = Math.max(maxSum, currentSum);
		    if(currentSum < 0){
			currentSum = 0;
		    }
		}

		return maxSum <= 0 ? 0 : maxSum;
	}

}
