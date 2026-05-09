/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head ; 
        int n=0;
        while(temp!=null){
            n++ ;
            temp = temp.next ;
        }
        int[] arr = new int[n] ;
        temp = head ;
        int i = 0;
        while(temp!=null){
            arr[i++] = temp.val ;
           temp = temp.next ;
        }
        return make(arr , 0 ,n-1) ;
    }
    static TreeNode make(int[] arr , int start , int end){
        if(start>end) return null ;
        int mid = start +(end-start)/2 ;
        TreeNode root = new TreeNode(arr[mid]) ;
        root.left = make(arr , start , mid-1) ;
        root.right = make(arr , mid+1 , end) ;
        return root ;
    }
}