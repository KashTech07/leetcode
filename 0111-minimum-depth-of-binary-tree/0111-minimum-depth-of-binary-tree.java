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
        int ans = find(root);
        return ans ;
    }
    static int find(TreeNode root ){
        if(root==null) return 0 ;
        if(root.left==null && root.right==null) return 1 ;
        int a , b ;
        if(root.left == null) {
            a = Integer.MAX_VALUE ;
        }
        else{
            a = find(root.left) ;
        }
        if(root.right == null) {
            b = Integer.MAX_VALUE ;
        }
        else{
            b = find(root.right) ;
        }
       
        return 1+Math.min(a,b) ;
    }
}