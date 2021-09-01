class Solution {
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;    
        }
        
        int i=0,j=0;
        while(i < nums.length){
            while(i < nums.length && nums[i] == 0){
                i++;
            }
            if(i == nums.length){
                return;
            }
            swap(nums, i ,j);
            i++;
            j++;
        }
        for(int k = j;k < nums.length; k++){
            nums[k] = 0;
        }
        
    }
}
