class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[n-1] > nums[0]){
            return nums[0];
        }
        int low = 0, high = n-1, mid = low + (high-low)/2;
        while(low < high){
            mid = low + (high-low)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            else if(nums[mid-1] > nums[mid]){
                return nums[mid];
            }
            else{
                if(nums[mid] > nums[0]){
                    low = mid+1;
                }
                else if(nums[mid] < nums[0]){
                    high = mid - 1;
                }
                
            }
        }
        return nums[mid];
    }
}
