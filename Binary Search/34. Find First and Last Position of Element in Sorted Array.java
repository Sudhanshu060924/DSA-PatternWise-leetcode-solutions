// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array?listId=552y65ke&page=1

class Solution {
    public int first(int[] a , int x){
        int l =0;int h =a.length-1; int res = -1;
        while(l<=h){
            int g = (h+l)/2;
            if(a[g]<x){
                l = g+1;
            }
            else if (a[g]>x){
                h = g-1;
            }
            else{
                res = g;
                h = g-1;
            }

        }
        return res;
    }
    public int last(int[] a , int x){
        int l =0;int h =a.length-1; int res = -1;
        while(l<=h){
            int g = (h+l)/2;
            if(a[g]<x){
                l = g+1;
            }
            else if (a[g]>x){
                h = g-1;
            }
            else{
                res = g;
                l = g+1;
            }

        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums,target) ,last(nums,target)};
        
    }
}