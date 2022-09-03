public class Solution {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
        
        int current0 = 0;
        int max0 = Integer.MIN_VALUE;
        int count1 = 0;
//         on flipping 1 -> 0 we loose 1, therfore val = -1 if we encounter 1 while traversing
        
//         on flipping 0 -> 1 we get 1, therefore val = 1 if we encounter 0 while traversing
        
        for(int num : arr){
            int val = 1;
            if(num == 1){
                count1++;
                val = -1;
            }
            
            // we can either consider taking only this element or keeping it as part of previous subarray
            current0 = Math.max(val, current0+val);
            max0 = Math.max(current0, max0);
        }
        
        if(max0 < 0){
// if no 0->1 transformation needed, let max0 = 0
            max0 = 0;
        }
        return max0+count1;
	}
}
