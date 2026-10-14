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
    public boolean isValidBST(TreeNode root) {
// //         if(root.left==null && root.right==null) return true ;
// //         return check(root ,Long.MIN_VALUE , Long.MAX_VALUE) ;
// //     }
// //     static boolean check(TreeNode root , long min , long max){
// //         if(root==null) return true ;
// //         if(root.val>=max || root.val<=min) return false ;
// //         return check(root.left , min , root.val) && check(root.right , root.val , max) ;
// //     }
// // }
// return solve(root,Long.MAX_VALUE , Long.MIN_VALUE);
// }
// static boolean solve(TreeNode root , Long max , Long min){
    
// }
return check(root , Long.MAX_VALUE , Long.MIN_VALUE) ; }
static boolean check(TreeNode root , long max  , long min){
    if(root== null) return true ;
    if(root.val>=max || root.val<=min) return false ;
    return check(root.left , root.val , min)&&check(root.right , max , root.val) ;
}}