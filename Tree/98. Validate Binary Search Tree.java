// https://leetcode.com/problems/validate-binary-search-tree?listId=552y65ke&page=1

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
        TreeNode prev = null;
        
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        if(!isValidBST(root.left)){
            return false;
        }
        if(prev==null){
            prev = root; // 1st node
        }
        else if(root.val<=prev.val){
            return false;
        }
        prev = root;
       if(!isValidBST(root.right)){
            return false;
        }

    return true;
        
    }
}