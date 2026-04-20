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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return max(nums , 0 , nums.length-1) ;
    }
    static TreeNode max(int[] arr , int start , int end){
        if(start>end) return null ;
         int maxindex = start;
        for(int i = start+1 ; i<=end ; i++){
            if(arr[maxindex]<=arr[i]){
                maxindex = i ;
            }
        }
        TreeNode root = new TreeNode(arr[maxindex]) ;
        root.left = max(arr , start , maxindex-1) ; 
        root.right = max(arr , maxindex+1 , end) ;
        return root ;
    }
}