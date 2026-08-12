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
    static int maxsum = Integer.MIN_VALUE ;
    public int maxPathSum(TreeNode root) {
        maxsum = Integer.MIN_VALUE ;
        int ans = solve(root);
        return maxsum ;
    }
    static int solve(TreeNode root){
        if(root==null) return 0 ;
        int l  = solve(root.left) ;
        int r = solve(root.right) ;

        int both_good = l+r+root.val ;
        int one_good = Math.max(l,r) + root.val ;
        int no_good = root.val ;
        maxsum = Math.max( maxsum , Math.max(both_good , Math.max(no_good,one_good))) ;
        return Math.max(one_good , no_good) ;
    }
}