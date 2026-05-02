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
    public TreeNode increasingBST(TreeNode root) {
       ArrayList<Integer> list = new ArrayList<>() ;
       inorder(root , list) ;
       TreeNode dummy = new TreeNode(-1) ;
       TreeNode curr = dummy ;
       for(int n : list){
        TreeNode node = new TreeNode(n) ;
        curr.right = node ;
        curr = curr.right ;
       }
       return dummy.right ;
    }
    static void inorder(TreeNode root , ArrayList<Integer> list){
        if(root==null) return ;
        inorder(root.left , list) ;
        list.add(root.val) ;
        inorder(root.right , list) ;
    }
}