import java.util.*;
public class Solution {
    public static long kadaneOfOne(ArrayList<Integer> arr, int n){
        long currentSum = 0;
        long maxSum = Long.MIN_VALUE;

        for(int i = 0;i < n;i++){
            int x = arr.get(i);
            currentSum += x;
            maxSum = Math.max(currentSum, maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        return maxSum;
    }
    
    
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
        if(k == 1){
            return kadaneOfOne(arr, n);
        }
        else{
            long sumOfArray = 0;
            for(int i = 0;i < arr.size();i++){
                sumOfArray += arr.get(i);
            }
            
            arr.addAll(arr);
            if(sumOfArray < 0){
                return kadaneOfOne(arr, n*2);
            }
            else{
                return (k-2)*sumOfArray + kadaneOfOne(arr, n*2);
            }
        }

	}
}
