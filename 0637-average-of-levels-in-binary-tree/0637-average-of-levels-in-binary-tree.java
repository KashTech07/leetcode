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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            double f = 0 ;
            for(int i = 0; i<n ; i++){
                TreeNode a = q.poll();
                f+=a.val ;
                if(a.left!=null) q.offer(a.left);
                if(a.right!=null) q.offer(a.right);
            }
            ans.add(f/n);

        }
        return ans ;
    }
}