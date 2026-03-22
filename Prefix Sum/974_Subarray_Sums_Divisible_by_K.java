// https://leetcode.com/problems/subarray-sums-divisible-by-k

import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // sum, count
        HashMap<Integer,Integer> map = new  HashMap<Integer,Integer>();

        map.put(0,1);
        int sum = 0;
        int ans = 0;
        int n = nums.length;

        for(int i =0;i<n;i++){
            sum += nums[i];
            int rem = sum % k; // we are interested in the remainder of the sum when divided by k, because if two sums have the same remainder, their difference is divisible by k
            if(rem<0){
                rem = rem+k; // if rem is negative, we can add k to it to get the correct positive remainder
            }
            ans = ans + map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
        
    }
}