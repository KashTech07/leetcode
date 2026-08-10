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
    public int countNodes(TreeNode root) {
        if(root==null) return 0 ;
        int lh = lheight(root.left) ;
        int rh = rheight(root.right) ;
        if(lh==rh) {
            return (int)(Math.pow(2,lh+1))-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right) ;
    } 
    static int lheight(TreeNode root){
        int h = 0 ;
        TreeNode temp = root ;
        while(temp!=null){
           temp=temp.left ;
           h++ ;
        }
        return h ;
    }
    static int rheight(TreeNode root){
        int h = 0 ;
        TreeNode temp = root ;
        while(temp!=null){
           temp=temp.right ;
           h++ ;
        }
        return h ;
    }
}