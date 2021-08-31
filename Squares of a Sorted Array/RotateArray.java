class Solution {
    public static void reverse(int[] nums, int i, int j){
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j -= 1;
            i += 1;
        }
    }
    
    
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return;
        }
    
        int n = nums.length;
        k = k % n;
        if(k < 0){
            k = k + nums.length;
        }
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
}
