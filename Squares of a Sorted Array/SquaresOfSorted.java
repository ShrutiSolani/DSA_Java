class Solution {
    public int[] sortedSquares(int[] nums) {
        int squares[] = new int[nums.length];
        int low = 0, high = nums.length-1, i = high;
        while(low <= high){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                squares[i] = nums[low]*nums[low];
                low += 1;
            }
            else{
                squares[i] = nums[high]*nums[high];
                high -= 1;
            }
            i-= 1;
        }
        return squares;
    }
}
