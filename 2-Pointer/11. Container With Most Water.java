// https://leetcode.com/problems/container-with-most-water?envType=problem-list-v2&envId=two-pointers

class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l=0;
        int n = height.length-1;
        int h =height.length-1;

        for(int i = 0;i<height.length;i++){
            if(height[l]>height[h]){
                int ans = height[h]*n;
                res = Math.max(ans,res);
                h--;
                n--;
            }
            else{
                int ans = height[l]*n;
                res = Math.max(ans,res);
                l++;
                n--;
            }
        }
        return res;
        
    }
}