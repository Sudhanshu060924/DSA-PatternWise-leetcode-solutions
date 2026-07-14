// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal?listId=552y65ke&page=1

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        int order =1;
        if(root == null){
            return res;
        }

        q.add(root);

        while(!q.isEmpty()){
            
            int levelsize = q.size();
            LinkedList<Integer> temp = new LinkedList<>();
           

            while(levelsize-->0){
                TreeNode t = q.peek();
                q.poll();

                if(order ==1){
                    temp.addLast(t.val);
                }
                else{
                    temp.addFirst(t.val);
                    
                }

                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
            }
            res.add(temp); order = 1-order;
        }

        return res;
    }
}