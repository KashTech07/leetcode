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
    public ListNode removeZeroSumSublists(ListNode head) {
        while(true){
        HashMap<Integer, Integer> map = new HashMap<>() ;
        map.put(0 ,-1) ;
        ListNode curr = head ;
        int i = 0 ;
        int sum = 0 ;
        int start = -1 ;
        int end = -1;
        for(curr = head ; curr!=null ; curr=curr.next){
            sum += curr.val ;
            if(map.containsKey(sum)){
                start = map.get(sum)+1 ;
                end = i ;
               // break ;
            }
            map.put(sum , i) ;
            i++ ;
        }
        if(start==-1) break ;
        ListNode temp = head ;
        int n = 0 ;
        ListNode dummy = new ListNode(-1) ;
        dummy.next = head ;
        ListNode prev = dummy ;
        while(temp!=null){
            if(n==start){
                while(n<=end){
                    temp = temp.next ;
                    n++ ;
                }
                prev.next = temp ;
                break ;
            }
            //temp = temp.next ;
            prev.next = temp ;
            prev = temp ;
            temp = temp.next ;
            n++ ;
        }
        head = dummy.next ;
    }
    return head ;
    }
}