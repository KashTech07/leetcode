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
    public int maxLevelSum(TreeNode root) {
      // HashMap<Integer ,Integer> map = new HashMap<>();
       int level = 1 ;
       int maxlevel = 1 ;
       int maxsum = Integer.MIN_VALUE ;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n= q.size();
            int sum = 0 ;
            for(int i = 0 ;i<n ; i++){
                TreeNode curr = q.poll();
                sum+=curr.val ;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            if(sum>maxsum){
                maxsum = sum ;
                maxlevel = level ;
            }
            level++;}
            return maxlevel ; }}
           