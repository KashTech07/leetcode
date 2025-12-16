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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy ;
        ListNode curr = head.next ;
        while(curr!=null){
            int sum = 0;
            while(curr.val!=0){
                sum = sum + curr.val;
                curr = curr.next;
            }
            ListNode newNode = new ListNode(sum);
            prev.next = newNode;
            prev = newNode ;
            curr = curr.next ;
        }
        return dummy.next ;
    }
}