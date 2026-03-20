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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>() ;
        fill(root , ans) ;
        return ans ;
    }
    static void fill(TreeNode root , List<Integer> ans) {
        if(root==null) {
            return ;
        }
        
        fill(root.left , ans); 
        fill(root.right , ans) ;
        ans.add(root.val) ;
    }
}