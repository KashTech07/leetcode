/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = null ;
        if(p.val>q.val){
       ans = fun(root , q, p) ;
        }
        else{
            ans = fun(root , p , q) ;
        }
        return ans ;
    }
    static TreeNode fun(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null ;
        if(root==p || root==q) return root ;
        else if(root.val>p.val && root.val>q.val){
            return fun(root.left  ,p , q ) ;
        }
        else if(root.val<p.val && root.val<q.val){
            return fun(root.right , p , q ) ;
        }
        else{
            return root ;
        }
    }
}