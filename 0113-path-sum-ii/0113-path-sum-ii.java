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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        fill(root , targetSum , new ArrayList<>() , ans  , 0) ;
        return ans ;
    }
    static void fill(TreeNode root, int k , ArrayList<Integer> curr , List<List<Integer>> ans ,int sum){
        if(root==null) return ;
        curr.add(root.val) ;
        if((root.left==null && root.right==null) && sum+root.val==k){
           // curr.add(root.val) ;
            ans.add(new ArrayList<>(curr)) ;
        }
        fill(root.left , k , curr , ans , sum+root.val) ;
        fill(root.right , k ,curr , ans , sum+root.val) ;
        curr.remove(curr.size()-1) ;
    }
}