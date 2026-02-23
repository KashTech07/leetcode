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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c = 0;
        ListNode temp = head ;
        while(temp!=null&&c<k){
            temp = temp.next ;
            c++;
        }
        if(k>c) return head ;
        ListNode curr = head ;
        ListNode prev = null ;
        for(int i = 0 ;i<k ; i++){
            ListNode next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        head.next = reverseKGroup(curr , k);
        return prev ;
    }
}