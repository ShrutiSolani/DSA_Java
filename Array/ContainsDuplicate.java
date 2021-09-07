class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<Integer>();
        for(int i = 0;i < nums.length; i++){
            numset.add(nums[i]);
        }
        if(numset.size() == nums.length){
            return false;
        }
        else{
            return true;
        }
        
    }
}
