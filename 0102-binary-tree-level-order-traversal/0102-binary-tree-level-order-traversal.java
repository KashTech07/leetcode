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
//         List<List<Integer>> ans = new ArrayList<>() ;
//         if (root == null) return ans;
//         fill(ans , root) ;
//         return ans ;
//     }
//    static void fill(List<List<Integer>> ans ,TreeNode root ){
//         Queue<TreeNode> q = new LinkedList<>() ;
//         q.add(root) ;
//         while(!q.isEmpty()){
//             int size = q.size() ;
//             ArrayList<Integer> list = new ArrayList<>() ;
//             for(int i = 0 ; i<size ; i++){
//                 TreeNode p = q.poll() ;
//                 list.add(p.val) ;
//                 if(p.left!=null) q.add(p.left) ;
//                 if(p.right!=null) q.add(p.right);
//             }
//             ans.add(list);
//         }
//     }
// }
List<List<Integer>> list = new ArrayList<>() ;
if(root==null) return list ;
fill(root , list) ;
return list ; }
static void fill(TreeNode root , List<List<Integer>> list){
    Queue<TreeNode> q = new LinkedList<>() ;
    q.add(root) ;
    while(!q.isEmpty()){
        List<Integer> a = new ArrayList<>() ;
        int size = q.size() ;
        for(int i = 0 ; i<size ; i++){
            TreeNode n = q.poll() ;
            a.add(n.val) ;
            if(n.left!=null) q.add(n.left) ;
            if(n.right!=null) q.add(n.right) ;
        }
        list.add(a) ;
    }
}}
