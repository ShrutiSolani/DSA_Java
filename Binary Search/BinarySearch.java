class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
        for(int i = 0;i < temp.length; i++){
            if(!rank.containsKey(temp[i])){
                rank.put(temp[i], i);
            }
        }
        for(int i=0;i < nums.length; i++){
            nums[i] = rank.get(nums[i]);
        }
        return nums;
    }
}
