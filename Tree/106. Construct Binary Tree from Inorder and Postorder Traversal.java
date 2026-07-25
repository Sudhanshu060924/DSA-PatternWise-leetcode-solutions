// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal

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
    private int idx;
    private HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
         this.idx = postorder.length - 1; 
                return fun(postorder,0,inorder.length-1);
    }
    

    private TreeNode fun(int[] postorder,int l,int h){
        if(l>h){
            return null;
        }
      

        TreeNode root = new TreeNode(postorder[idx]);
        

        int id = map.get(postorder[idx--]);
        root.right=fun(postorder,id+1,h);
        root.left=fun(postorder,l,id-1);


        return root;

    }
}
