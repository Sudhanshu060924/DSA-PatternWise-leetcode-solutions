// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal?listId=552y65ke&page=1

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
    private int idx = 0;
    private HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return fun(preorder,0,inorder.length-1);
        
    }
    private TreeNode fun(int[] preorder,int l,int h){
        if(l>h){
            return null;
        }

        TreeNode root = new TreeNode(preorder[idx]);
        

        int id = map.get(preorder[idx++]);
        root.left=fun(preorder,l,id-1);
        root.right=fun(preorder,id+1,h);

        return root;

    }
}