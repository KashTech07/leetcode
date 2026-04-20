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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>() ;
        ArrayList<Integer> b = new ArrayList<>() ;
       fill(root1 , a) ;
       fill(root2 , b) ;
        return a.equals(b) ;
    }
    static void fill(TreeNode root , ArrayList<Integer> curr){
        if(root==null) return  ;
        if(root.left==null && root.right==null){
            curr.add(root.val) ;
            return ;
        }
        fill(root.left , curr) ;
        fill(root.right , curr) ;
    }
}