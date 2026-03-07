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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy ;
        ListNode curr = head ;
        while(curr!=null){
            if(curr.next!=null&&curr.next.val==curr.val){
                int v = curr.val ;
                while(curr!=null && curr.val==v){
                    curr = curr.next ;
                }
                prev.next = curr ;}
                //curr = curr.next ;}
                else{
                    prev.next = curr ;
                    prev = curr ;
                    curr = curr.next ;
                }
            }
            return dummy.next ;
        }
        
    }
