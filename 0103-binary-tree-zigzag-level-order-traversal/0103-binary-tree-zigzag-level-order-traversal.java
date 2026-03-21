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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        if(root==null) return list ;
        q.add(root) ;
        boolean leftToRight = true ;
        while(!q.isEmpty()){
            int size = q.size() ;
            ArrayList<Integer> l = new ArrayList<>() ;
                for(int i = 0 ; i<size ; i++){
                    TreeNode a = q.poll() ;
                    if(leftToRight){
                       l.addLast(a.val);
                }
                else{
                    l.addFirst(a.val) ;
                }
                if(a.left!=null) q.add(a.left) ;
                if(a.right!=null) q.add(a.right) ;
            }
            list.add(l) ;
            leftToRight = !leftToRight ;
 
    }
            return list ;
}
}