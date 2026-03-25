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
    public int pairSum(ListNode head) {
        ListNode temp = head ;
        int l = 0 ;
        while(temp!=null){
            temp = temp.next ; 
            l++ ;
        }
        ListNode temp2  = head ;
        int[] arr = new int[l] ;
        for(int i = 0 ; i< l ; i++){
            arr[i] = temp2.val ; 
            temp2 = temp2.next ;
          }
          int sum = 0 ;
          int a = 0 ;
          int b = l-1 ;
          while(a<b){
            if(0<=a && a<=(l/2)-1) {
                sum = Math.max(sum , arr[a]+arr[b]);
            }
            a++ ;
            b-- ;
          }
          return sum ;
    }
}