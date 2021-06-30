class TwoSumArray {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int i = 0;i < nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x) && (map.get(x) != i)){
                a[0] = i;
                a[1] = map.get(x);
                break;
            }
        }
        return a;
    }
}