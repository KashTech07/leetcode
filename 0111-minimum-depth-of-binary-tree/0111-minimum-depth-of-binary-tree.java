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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if(root.left==null&&root.right==null) return 1 ;
        int ll =0;
        int rl = 0;
        if(root.left==null) ll = Integer.MAX_VALUE;
          else ll = leafnode(root.left);
         
         if(root.right==null) rl = Integer.MAX_VALUE;
          else rl = leafnode(root.right);
        return 1+Math.min(rl,ll);
    }
    static int leafnode(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null)
            return 1;
        return 1+Math.min(leafnode(root.left),leafnode(root.right));
    }
}