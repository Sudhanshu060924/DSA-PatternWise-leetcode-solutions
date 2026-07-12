// https://leetcode.com/problems/combination-sum?listId=552y65ke&page=1

import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int n = candidates.length;
        int sum =0;
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        fun(candidates , n ,0,sum, temp,res,target);
        return res;
        
    }

    void fun(int[] arr , int n , int id , int sum , List<Integer> temp , List<List<Integer>> res , int target){
        //base case 
        if(id == n){
            if(sum == target){
               res.add(new ArrayList<>(temp));
            }
            return;
        }

        // choice 1 don't take current 
        fun(arr,n,id+1,sum,temp,res,target);

        // choice2 take current 
        if(arr[id]+sum<=target){
            temp.add(arr[id]);
            sum += arr[id];
        fun(arr,n,id,sum,temp,res,target); //call same index again
       temp.remove(temp.size() - 1);
         sum -= arr[id];
            return;
        }

    }

}