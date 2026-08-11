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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>() ;
        HashMap<String,Integer> map = new HashMap<>() ;
        solve(ans , root, map) ;
        return ans ;
    }
    static String solve(List<TreeNode> ans , TreeNode root , HashMap<String,Integer> map){
        if(root==null){
            return "N" ;
        }
        String s = root.val+","+solve(ans , root.left , map)+","+solve(ans , root.right , map) ;
        if(map.getOrDefault(s,0)==1){
            ans.add(root) ;
        }
        map.put(s , map.getOrDefault(s,0)+1) ;
        return s ;

    }
}