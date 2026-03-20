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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k] ;
        int l = 0 ;
        ListNode temp = head ;
        while(temp!=null) {
            l++ ;
            temp = temp.next ;
        }
        int n = l/k ;
        int extra = l%k ;
        int count = 0 ;
        ListNode curr = head ;

        for(int i = 0 ; i<k ; i++){
            ans[i] = curr ;
            int size = (extra>0)?n+1 : n ;
            if(extra>0) extra-- ;

            for(int j=0 ; j<size-1 ; j++){
                if(curr!=null)curr = curr.next ;
            } 
            if(curr!=null){
                ListNode next = curr.next ;
                curr.next = null ;
                curr = next ;
            }}
            return ans ;}
}