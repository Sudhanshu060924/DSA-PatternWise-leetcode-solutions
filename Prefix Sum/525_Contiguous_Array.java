// https://leetcode.com/problems/contiguous-array?listId=552y65ke&page=1

class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap <Integer,Integer> map = new HashMap <Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }
            int diff = zero-one;
            if(diff == 0){
                res = Math.max(res,i+1);
                continue;

            }
            if(map.containsKey(diff)){
                int len = i - map.get(diff);
                res = Math.max(res,len);
            }
            else{
                map.put(diff,i);
            }
        }
        return res;
        
        
    }
}