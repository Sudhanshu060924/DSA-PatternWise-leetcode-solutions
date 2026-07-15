// https://leetcode.com/problems/binary-tree-postorder-traversal?listId=552y65ke&page=1

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        fun(root,res);
        return res;
    }
       void fun(TreeNode root , List<Integer> res ){
        if(root == null) return ;

        
      
        fun(root.left , res);
        fun(root.right,res);
        res.add(root.val);
}}