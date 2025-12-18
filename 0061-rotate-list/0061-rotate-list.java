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
        ListNode temp = head ;
        int n=1 ;
        if (head == null || head.next == null || k == 0)
            return head;
        while(temp.next!=null){
            temp = temp.next ;
            n++;
        }
        temp.next = head ;
        k = k%n ;
        if(k==0) {
            temp.next = null;
            return head ;}
        ListNode newHead = head ;
        for(int i =0 ; i< n-k-1 ; i++){
            newHead=newHead.next ;
        }
        ListNode ans = newHead.next;
        newHead.next = null ;
        return ans;


    }
}