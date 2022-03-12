import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	
    public static long kadane(ArrayList<Integer> arr){
    	long curr = 0;
        long max = 0;
        int negative = 0;
        for(int i = 0;i < arr.size(); i++){
            if(arr.get(i) < 0){
                negative ++;
            }
            curr = curr + arr.get(i);
            max = Math.max(max, curr);
            if(curr < 0){
                curr = 0;
            }
        }
        if(negative == arr.size()){
            long x = Collections.max(arr);
            return x;
        }
        return max;
    }
    
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
        if(k == 1){
            long response = kadane(arr);
            return response;
        }
        else{
            int sum = 0;
            for (int number : arr){
                sum += number;
            }
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
        	new_arr.addAll(arr);
            new_arr.addAll(arr);
            if(sum < 0){    
        		long response = kadane(new_arr);
        		return response;
            }
            else{
                long response = kadane(new_arr);
                response += (long)(k-2)*sum;
                return response;
            }
        }
	}
}
