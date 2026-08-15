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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>() ;
        int level = 0 ;
        int ans = 0 ;
        q.add(root) ;
        while(!q.isEmpty()){
            int size = q.size() ;
            level++ ;
            for(int i = 0 ; i<size ; i++){
                TreeNode t = q.poll() ;
                if(i==0){
                ans = t.val ;}
                if(t.left!=null) q.add(t.left) ;
                if(t.right!=null) q.add(t.right) ;
                   // break ;
                }
               
            }
           // level++ ;
        
        return ans ;
    }
}