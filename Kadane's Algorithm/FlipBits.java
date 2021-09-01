public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        int count_zero = 0, count_one = 0;
        int max_zero = Integer.MIN_VALUE;
        for(int i = 0;i < n; i++){
            if(arr[i] == 1){
                count_one += 1;
                count_zero = 0;
            }
            else{
                count_zero += 1;
                max_zero = Math.max(max_zero, count_zero);
            }
        }
        return max_zero+count_one;
	}
}
