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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head ;
        ListNode fast = head ;
        int i = 0;
        while(i<k-1){
            slow = slow.next;
            i++ ;
        }
        ListNode temp = slow ;
        while(slow!=null&&slow.next!=null){
            slow = slow.next ;
            fast = fast.next ;
        }
        int val = temp.val;
        temp.val = fast.val;
        fast.val = val;

        return head;}}