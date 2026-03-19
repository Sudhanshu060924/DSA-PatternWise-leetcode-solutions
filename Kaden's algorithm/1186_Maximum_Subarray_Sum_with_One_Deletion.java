// https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion?listId=552y65ke&page=1

class Solution {
    public int maximumSum(int[] arr) {
// we will use 3 variables, bestsum_withno_delete to store the maximum sum of the subarray ending at the current index without deleting any element, bestsum_with1_delete to store the maximum sum of the subarray ending at the current index with deleting one element, and result to store the final result
        int i =0;
        int bestsum_withno_delete = arr[0];
        int bestsum_with1_delete = Integer.MIN_VALUE;
        int result = arr[0];
// we will iterate through the array starting from the second element, because we have already initialized the variables with the first element
        for(i =1;i<arr.length;i++){
            // we will calculate the maximum sum of the subarray ending at the current index without deleting any element, because if the current number is negative, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index, and if the current number is positive, then the best sum of the subarray ending at the previous index will become the best sum of the subarray ending at the current index
            int prevnodel = bestsum_withno_delete;
            bestsum_withno_delete = Math.max(arr[i],arr[i]+bestsum_withno_delete);
int v;
            if(bestsum_with1_delete == Integer.MIN_VALUE){
                v = arr[i];
            }
            else{
                v = arr[i]+ bestsum_with1_delete ;
            }
            // we will calculate the maximum sum of the subarray ending at the current index with deleting one element, because if the current number is negative, then the best sum of the subarray ending at the previous index with deleting one element will become the best sum of the subarray ending at the current index with deleting one element, and if the current number is positive, then the best sum of the subarray ending at the previous index with deleting one element will become the best sum of the subarray ending at the current index with deleting one element
            bestsum_with1_delete = Math.max(v,prevnodel);
            result = Math.max(result,Math.max(bestsum_with1_delete,bestsum_withno_delete));
        }
        return result;
        
    }
}