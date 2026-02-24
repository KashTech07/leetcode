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
    public int sumRootToLeaf(TreeNode root) {
        int a = sum(root , "");
        return a ;
    }
    static int sum(TreeNode root , String ans){
        if(root==null) {
            
            return 0;
        }
        ans+=root.val;
        if(root.left==null&&root.right==null){
             int c = converted(ans);
            return c ;
        }
         return sum(root.left , ans)+sum(root.right , ans);
    }
    static int converted(String s){
        int decimal = 0 ;
        for(int i = 0 ;i<s.length() ; i++){
            decimal = decimal*2 + (s.charAt(i)-'0');
        }
        return decimal ;
    }
}