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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null ;
        if(key>root.val){
            root.right = deleteNode(root.right , key) ;
        }
        else if(key<root.val){
            root.left = deleteNode(root.left , key) ;
        }
        else{
            if(root.left==null) return root.right ;
            if(root.right==null) return root.left ;
            int minValue = findMin(root.right) ;
            root.val = minValue ;
            root.right = deleteNode(root.right , minValue) ;
        }
        return root ;
    }
    static int findMin(TreeNode root){
        TreeNode temp = root ;
        while(temp.left!=null){
            temp=temp.left ;
        }
        return temp.val ;
    }
}