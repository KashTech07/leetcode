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
    public int longestZigZag(TreeNode root) {
        maxsum = Integer.MIN_VALUE ;
        boolean goleft = true ;
        solve(root ,0, goleft ) ;
        return maxsum ;
    }
    static void solve(TreeNode root ,int count , boolean goleft){
        if(root==null) return ;
        maxsum = Math.max(maxsum , count) ;
        if(goleft){
            solve(root.left , count+1 , !goleft) ;
            solve(root.right , 1 , goleft) ;
        }
        else{
            solve(root.left , 1 , goleft) ;
            solve(root.right , count+1 , !goleft) ;
        }
    }
}