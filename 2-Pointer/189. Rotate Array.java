// https://leetcode.com/problems/rotate-array?envType=problem-list-v2&envId=two-pointers

class Solution {

    int[] rotate(int[] arr, int start , int end){
        while(start<end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
return arr;
    }
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k%n;

        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);

        
    }
}