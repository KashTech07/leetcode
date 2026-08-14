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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        solve(root , map);
        int x = 0 ;
        int maxfreq = 0 ;
        int[] ans = new int[map.size()] ;
        for(int n : map.keySet()){
            if(map.get(n)>maxfreq){
                maxfreq = map.get(n) ;
            }
        }
        for(int n : map.keySet()){
            if(map.get(n)==maxfreq){
                ans[x] = n ;
                x++ ;
            }
        }
        return Arrays.copyOf(ans,x) ;
    }
    static int solve(TreeNode root , HashMap<Integer , Integer> map){
        if(root==null) return 0 ;
        int a = solve(root.left , map) ;
        int b = solve(root.right , map) ;
        int sum = a+b+root.val ;
        map.put(sum , map.getOrDefault(sum,0)+1) ;
        return sum ; 
    }
}