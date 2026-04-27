// https://leetcode.com/problems/peak-index-in-a-mountain-array?envType=problem-list-v2&envId=binary-search

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l =0;
        int h = arr.length-1;
        int res =-1;

        while(l<=h){
            int g = (l+h)/2;
            if(arr[g]<arr[g+1]){
                l=g+1;
            }
            else{
                res = g;
                h = g-1;
            }
        }
        return res;
        
    }
}