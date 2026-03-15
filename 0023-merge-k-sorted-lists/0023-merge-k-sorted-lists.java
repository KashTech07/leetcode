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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null ;
        ListNode h1 = lists[0] ;
        for(int i = 1 ;i<lists.length ; i++){
             h1 = Merge(h1 ,lists[i] ) ;
        }
        return h1 ;
    }
    static ListNode Merge(ListNode h1 , ListNode h2){
        ListNode t1 = h1 ;
        ListNode t2 = h2 ;
        ListNode dummy = new ListNode(-1) ;
        ListNode curr = dummy ;
        while(t1!=null&&t2!=null){
            if(t1.val<t2.val){
                curr.next = t1;
                t1 = t1.next ;
            }
            else{
               curr.next = t2;
                t2 = t2.next ;
            }
            curr = curr.next ;
        }
        while(t1!=null){
            curr.next = t1 ;
            t1 = t1.next ;
            curr=curr.next ;
        }
        while(t2!=null){
            curr.next = t2 ;
            t2 = t2.next ;
            curr = curr.next ;
        }
        return dummy.next ;
    }
}