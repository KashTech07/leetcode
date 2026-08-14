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
    public boolean evaluateTree(TreeNode root) {
        return solve(root) ;
    }
    static boolean solve(TreeNode root){
        if(root==null) return false ;
        if(root.left==null && root.right==null) {
            return root.val==0 ? false : true ;
        }
        boolean a = solve(root.left) ;
        boolean b = solve(root.right) ;
        return root.val==2 ? (a||b) : (a&&b) ;
    }
}