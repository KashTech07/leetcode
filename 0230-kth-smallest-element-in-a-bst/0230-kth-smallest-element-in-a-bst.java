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
 static int count = 0 ;
    static int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;   
        ans = 0;
        fill(root, k) ;
        return ans ;
    }
    static void fill(TreeNode root , int k ) {
        if(root==null) return  ;
        fill(root.left , k) ;
        if(++count == k){
            ans = root.val ;
            return  ;
        }
         if (count < k)
        fill(root.right , k) ;
    }
}