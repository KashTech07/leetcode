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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy3 = new ListNode(-1);
        ListNode tail2 = dummy3 ;
        ListNode dummy = new ListNode(-1);
        ListNode tail1 = dummy ;
        ListNode temp = head ;
        while(temp!=null){
            if(temp.val>=x){
                tail2.next = temp ;
                tail2 = temp ;
            }
            else{
                tail1.next = temp ; 
                tail1 = temp ; 
            }
            temp=temp.next;
        }
        tail1.next = dummy3.next ;
        tail2.next = null ;
        return dummy.next ;
        
    }
}