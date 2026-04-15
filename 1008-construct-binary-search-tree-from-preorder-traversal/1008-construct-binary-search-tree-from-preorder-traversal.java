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
    public int idx ;
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder = new int[preorder.length] ;
        int n = preorder.length ;
        idx = 0 ;
        for(int i = 0 ; i<n ;i++){
            inorder[i] = preorder[i] ;
        }
        Arrays.sort(inorder) ;
        return solve(preorder , inorder , 0 , n-1 ) ;
    }
    public TreeNode solve(int[] preorder , int[] inorder , int start , int end){
        if(start>end) return null ;
        TreeNode root = new TreeNode(preorder[idx]) ;
        idx++ ;
        int i = search(inorder , root.val) ;
        root.left = solve(preorder , inorder , start ,i-1 ) ;
         root.right = solve(preorder , inorder , i+1 ,end ) ;
         return root ;
    }
     public int search(int[] arr, int v) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)
                return i;
        }
        return -1;
    }

}