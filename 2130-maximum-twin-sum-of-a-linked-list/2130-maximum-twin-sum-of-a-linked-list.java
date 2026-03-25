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
    public int pairSum(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        if(head==null) return 0 ;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        ListNode head2 = reverse(slow) ;
        ListNode head1 = head ;
        int sum = 0 ;
        int maxsum = 0 ;
        while(head2!=null){
           sum = head1.val + head2.val ;
           maxsum = Math.max(sum , maxsum);
           head1 = head1.next ; 
           head2 = head2.next ;
        }
        return maxsum ;

    }
    static ListNode reverse(ListNode head) {
        ListNode prev = null ; 
        ListNode curr = head ;
        while(curr!=null){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ; 
            curr = next ;
        }
        return prev ;
    }
}