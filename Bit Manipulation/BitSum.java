// You are given a list of integers nums and an integer k. You must perform this operation k times:

// Choose any number on the list. In the binary representation of the number, choose a bit that is 0 and make it 1.

// Return the minimum possible sum of all the numbers (mod 10 ** 9 + 7) after performing k operations.

// Example 1
// Input

// nums = [2, 5, 2, 0, 5, 8, 8]

// Output

// 8

// Explanation

// nums[2] can catch 3 rain drops, and nums[3] can catch 5 for a total of 8.


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
