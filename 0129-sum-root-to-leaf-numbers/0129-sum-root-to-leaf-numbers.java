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
    public int sumNumbers(TreeNode root) {
       // int ans = 0 ;
         return find(root , 0 );
       
    }
    static int find(TreeNode root , int ans){
        if(root==null) return 0;
        ans = ans*10 + root.val ;
        if(root.left==null && root.right==null) {
            //ans = ans*10 + root.val ;
            return ans;
        }
        return find(root.left , ans) + find(root.right , ans) ;

        
    }
}