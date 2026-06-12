/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
       ListNode prev;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val;
 this.next =null;
 this.prev=null; }
 *    
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head==null ) return head ;
      ListNode temp = head ;
      int c = 1 ;
      while(c<=n){
        temp = temp.next ;
        c++ ;
      }
      if(temp==null) return head.next ;
      ListNode curr = head ;
      while(temp.next!=null){
         curr = curr.next ;
         temp = temp.next ;
      }
      curr.next = curr.next.next ;
      return head ; }}

       