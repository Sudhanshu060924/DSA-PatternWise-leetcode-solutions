//https://leetcode.com/problems/minimum-size-subarray-sum?envType=problem-list-v2&envId=sliding-window
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int l = 0;
     int h = 0;
     int r = Integer.MAX_VALUE;
     int s =0;
     while(h<nums.length){
        s = s + nums[h];
        while(s>=target){
            int len = h-l+1;
            r = Math.min(r,len);
            s = s-nums[l];
            l++;
        }
        h++;
        
     }
     
     
    
     if(r==Integer.MAX_VALUE){
        return 0;
     }
     else{
        return r;
     }

    }
}