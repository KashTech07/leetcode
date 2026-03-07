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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        ListNode t1 = l1 ;
        ListNode t2 = l2 ;
        while(t1!=null){
            s1.push(t1);
            t1 = t1.next ;
        }
        while(t2!=null){
            s2.push(t2);
            t2 = t2.next ;
        }
        int c = 0;
        ListNode prev = null ;
        while(!s1.isEmpty()||!s2.isEmpty()||c>0){
            int a = s1.isEmpty()?0:s1.pop().val;
            int b = s2.isEmpty()?0:s2.pop().val;
            int sum = a+b+c;
            ListNode node = new ListNode(sum%10) ;
            node.next = prev ;
            prev = node ;
            c = sum/10 ;
        }
        return prev ;
    }
}