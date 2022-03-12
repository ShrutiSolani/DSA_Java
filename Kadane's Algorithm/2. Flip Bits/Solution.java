public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        int count1 = 0;
        int curr = 0;
        int max = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] == 1){
                count1++;
                curr = Math.max(-1, curr-1);
            }
            else{
                curr = Math.max(1, curr+1);
            }
            max = Math.max(curr, max);
        }
        return count1+max;
	}
}
