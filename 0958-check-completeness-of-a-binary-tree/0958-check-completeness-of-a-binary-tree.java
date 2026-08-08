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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;
        boolean past = false ;
        while(!q.isEmpty()){
            TreeNode n = q.poll() ;
            if(n==null) past = true ;
            else{ 
            if(past==true) return false ;
             q.add(n.left) ;
             q.add(n.right) ;
        }}
        return true ;
    }
}