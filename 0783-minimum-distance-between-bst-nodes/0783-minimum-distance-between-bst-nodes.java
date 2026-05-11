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
    static int ans = Integer.MAX_VALUE ;
    static int prev = -1 ;
    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE ;
        prev = -1 ;
        count(root) ;
        return ans ;
    }
    static void count(TreeNode root) {
        if(root==null) return ;
        count(root.left) ;
        if(prev==-1) prev=root.val ;
        else{ans = Math.min(ans , Math.abs(root.val-prev)) ;
        prev = root.val ;}
        count(root.right) ;
    }
}