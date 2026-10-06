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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2] ;
        ListNode prev = head ;
        ListNode curr = head.next ;
        if(curr==null || curr.next==null) return new int[]{-1,-1} ;
        ListNode next = null ;
        int pos = 2 ;
        int f = Integer.MAX_VALUE ;
        int l = -1 ;
        int sl = -1  ;
        int min = Integer.MAX_VALUE  ;
        while(curr.next!=null){
            next = curr.next ;
            if(prev.val>curr.val && next.val>curr.val  || prev.val<curr.val && next.val<curr.val) {
               f = Math.min(f , pos) ;
               sl = l ;
               l = pos ;
               if(sl!=-1){
   min = Math.min(min , l-sl) ;
               }
            }
            pos++ ;
            prev = curr ;
            curr = next ;

        }
        if(l==-1 || f==Integer.MAX_VALUE || min==Integer.MAX_VALUE || sl==-1) return new int[]{-1,-1} ;
        return new int[]{min, l-f} ;}}