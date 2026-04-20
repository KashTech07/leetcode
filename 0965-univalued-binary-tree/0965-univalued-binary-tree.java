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
    public boolean isUnivalTree(TreeNode root) {
       return check(root , root.val) ;
       }
       static boolean check(TreeNode root , int prev){
        if(root==null) return true ;
        if(root.val!=prev) return false ;
        prev = root.val ;
        return check(root.left , prev)&&check(root.right , prev) ;
       }
}