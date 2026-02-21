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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int l = 0 ;
        ListNode temp = head ;
        while(temp!=null){
            l++;
            temp=temp.next ;
        }
         k = k%l ;
        ListNode temp2 = head ;
        for(int i = 0 ;i<l-k-1 ; i++){
            temp2 = temp2.next ;
        }
        ListNode n = temp2.next ;
        temp2.next = null;
        ListNode head2 = reverse(n);
        while(head2!=null){
            ListNode n2 = head2.next;
            head2.next = head ;
            head = head2 ;
            head2 = n2;
            
        }
        return head ;

    }
    static ListNode reverse(ListNode head){
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