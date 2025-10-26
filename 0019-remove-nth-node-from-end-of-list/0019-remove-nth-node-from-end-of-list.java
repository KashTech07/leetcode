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
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if (n == length) {
            return head.next;
        }
        ListNode temp2= new ListNode(0);
        temp2.next=head;
        for(int i=0;i<length-n;i++){
           temp2=temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;}}
       