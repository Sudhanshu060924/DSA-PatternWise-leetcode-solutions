// https://leetcode.com/problems/search-in-a-binary-search-tree?listId=552y65ke&page=1

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
        TreeNode res = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        fun(root,val);
        
        return res;
    }
    void fun(TreeNode root,int val ){
        if(root == null) return;
        if(root.val == val){
            res = root;
            return;
        }
        if(root.val>val){
            fun(root.left,val);
        }
        else{
            fun(root.right,val);
        }
    }
}