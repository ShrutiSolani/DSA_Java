//This solution use extra space
//Another approach is using set

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int i;
        int count[] = new int[n];
        for(i = 0;i < n; i++) {
            count[i] = 0;
        }
        for (i = 0; i < n+1; i++){
            count[nums[i]-1] += 1;
            if ( count[nums[i]-1] == 2){
                break;
            }
        }
        return nums[i];
    }
}