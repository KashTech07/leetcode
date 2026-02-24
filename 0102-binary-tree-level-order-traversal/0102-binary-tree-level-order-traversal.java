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
    public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            List<List<Integer>> ans = new ArrayList<>();
             if(root == null) return ans; 
            q.offer(root);
            while(!q.isEmpty()){
                int n = q.size();
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = 0 ;i<n ; i++){
                    TreeNode a = q.poll();
                    list.add(a.val);
                    if(a.left!=null) q.offer(a.left);
                    if(a.right!=null) q.offer(a.right);
                }
                ans.add(list);

            }
            return ans ;
    }
}