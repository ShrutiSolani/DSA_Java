import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        int[] bits = new int[32];
        int sum = 0, mod = (int)Math.pow(10,9) + 7;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            sum = sum % mod;
            for(int j = 0;j < 32;j++){
                if((nums[i] & (1 << j)) == 0){
                    bits[j]++;
                }
            }
        }
        
        int j = 0;
        while(k > 0){
            while(bits[j] == 0){
                j++;
            }
            sum += (1 << j);
            sum = sum%mod;
            bits[j]--;
            k--;
        }
        return sum;
    }
}
