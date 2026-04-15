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
      static int idx ;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length ;
         idx = postorder.length-1;
        return solve(inorder , postorder , 0 , n-1) ;
    }
    static TreeNode solve(int[] inorder , int[] postorder , int start , int end){
        if(start>end) return null ;
        TreeNode root = new TreeNode(postorder[idx]) ;
        idx-- ;
        int i = search(inorder , root.val) ;
         root.right = solve(inorder , postorder , i+1 , end) ;
        root.left = solve(inorder , postorder , start , i-1) ;
        return root ;
    }
    static int search(int[] arr , int x){
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==x) return i ;
        }
        return -1 ;
    }
}