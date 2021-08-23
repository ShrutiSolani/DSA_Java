class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length - 1, low = 0, mid;
        mid = low + (high - low)/2;
        while(high >= low){
            mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(nums[mid] < target){
            return mid + 1;
        }
        else{
            return mid;
        }
    }
}
