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
        if(root==null) return null ;
       if(root==p || root==q) return root ; 

       TreeNode a1 = lowestCommonAncestor(root.left , p ,q);
       TreeNode a2 = lowestCommonAncestor(root.right , p ,q); 
        if(a1!=null&& a2!=null) return root ;
        return (a1!=null)?a1:a2 ;

         }
}