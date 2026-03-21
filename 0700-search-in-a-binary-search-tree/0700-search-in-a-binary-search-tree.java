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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null ;
        if(root.val==val){
            return root ;
        }
        TreeNode a1 = null ;
        TreeNode b1 = null ;
        if(val<root.val){
            a1 = searchBST(root.left , val);
        }
        else{
            b1 = searchBST(root.right , val);
        }
        return a1==null ? b1 : a1 ;
    }
}