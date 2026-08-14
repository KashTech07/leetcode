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
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            int prev;

            if (level % 2 == 0)
                prev = Integer.MIN_VALUE;
            else
                prev = Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {

                TreeNode n = q.poll();

                // Even level → odd values + increasing
                if (level % 2 == 0) {

                    if (n.val % 2 == 0 || n.val <= prev)
                        return false;

                }

                // Odd level → even values + decreasing
                else {

                    if (n.val % 2 != 0 || n.val >= prev)
                        return false;
                }

                prev = n.val;

                if (n.left != null)
                    q.add(n.left);

                if (n.right != null)
                    q.add(n.right);
            }

            level++;
        }

        return true;
    }
}