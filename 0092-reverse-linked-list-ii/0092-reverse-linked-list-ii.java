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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev1 = dummy;
        int c = 1 ;
        while(c<left){
            prev1 = prev1.next ;
            c++ ;
        }
        ListNode l1 = prev1.next ; 
        ListNode curr = prev1.next ;
        ListNode prev = null ;
        ListNode next = null ;
        for(int i = 0 ; i<right-left+1 ; i++){
            next = curr.next ;
             curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        prev1.next = prev ;
        l1.next = curr ;
        return dummy.next ;

    }
}