// https://leetcode.com/problems/check-completeness-of-a-binary-tree?listId=552y65ke&page=1

import java.util.LinkedList;
import java.util.Queue;

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
    public boolean isCompleteTree(TreeNode root) {
        if(root == null) return true;
        boolean nullSeen = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t==null){
                nullSeen = true;
            }
            else{
                if(nullSeen == true){
                    return false;
                }
                
            q.add(t.left);
            q.add(t.right);
            }
    
        }
        return true;
    }
}