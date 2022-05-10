class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            else{
                set.add(n);
            }
        }
        return false;
    }
}
