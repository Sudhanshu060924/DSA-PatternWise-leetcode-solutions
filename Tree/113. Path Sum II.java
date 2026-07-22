// https://leetcode.com/problems/path-sum-ii

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

import javax.swing.tree.TreeNode;
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<Integer> temp = new ArrayList<>();

        
        fun(root,0,targetSum,temp);

        return res;
    }

    void fun(TreeNode root,int sum , int target , List temp){
        if(root == null) return;
        sum += root.val;
        temp.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == target){
                res.add(new ArrayList<>(temp));
                temp.remove(temp.size()-1);
                return;
            }
        }
        fun(root.left,sum,target,temp);
        fun(root.right,sum,target,temp);
        temp.remove(temp.size()-1);
        return;
    }


}