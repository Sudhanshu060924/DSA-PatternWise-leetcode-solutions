// https://leetcode.com/problems/binary-tree-level-order-traversal-ii?listId=552y65ke&page=1

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
      if(root == null){
        return res;
      }

      q.add(root);

      while(!q.isEmpty()){
        List<Integer> temp = new ArrayList<>();
        int level = q.size();

        while(level-->0){
            TreeNode t = q.poll();
            temp.add(t.val);
            if(t.left != null){
                q.add(t.left);
            }
            if(t.right != null){
                q.add(t.right);
            }
        }
        res.addFirst(temp);
      }
        
        return res;
    }
}