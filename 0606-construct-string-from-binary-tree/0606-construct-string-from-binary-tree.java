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
    static String temp = "" ;
    public String tree2str(TreeNode root) {
         temp = "" ;
        solve(root) ;
        return temp ;
    }
    static void solve(TreeNode root ){
        if(root==null) return ;
         temp+=root.val ;
         if(root.left!=null){
            temp+="(" ;
            solve(root.left) ;
            temp+=")" ;
         }
         if(root.right!=null){
             if(root.left==null) temp+="()" ;
            temp+="(" ;
            solve(root.right) ;
            temp+=")" ;
         }
    }}