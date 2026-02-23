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
    public ListNode swapPairs(ListNode head) {
        ListNode head1 = reversePairs(head , 2);
        return head1;
    }
    static ListNode reversePairs(ListNode head , int k){
        ListNode temp = head ;
        int c = 0;
        while(temp!=null&&k>c){
            temp = temp.next ;
            c++;
        }    
        if(c<k) return head ;
        ListNode curr = head ;
        ListNode prev = null ;
        for(int i = 0 ;i<k ; i++){
            ListNode next = curr.next ;
            curr.next = prev ; 
            prev = curr ;
            curr = next ;
        }
        head.next = reversePairs(curr, k);
        return prev ;

}}