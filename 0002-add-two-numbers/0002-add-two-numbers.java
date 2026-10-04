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
//        ListNode dummy = new ListNode(-1);
//        ListNode curr = dummy;
//        ListNode t1 = l1;
//        ListNode t2 = l2;
//        int carry = 0;
//        while(t1!=null || t2!=null || carry>0){
//         int a = t1!=null ? t1.val : 0 ;
//         int b = t2!=null ? t2.val : 0 ;
//         int num = a+b+carry ;
//         ListNode newNode = new ListNode(num%10);
//         carry = num/10;
//         curr.next = newNode ;
//         curr = curr.next ;
//         if(t1!=null){
//             t1 =t1.next ;
//         }
//         if(t2!=null){
//             t2 = t2.next;
//         }

//        }
//        return dummy.next ; 
//     }
// }
ListNode dummy = new ListNode(-1) ;
ListNode prev = dummy ;
ListNode curr1 = l1 ;
ListNode curr2 = l2 ; 
int c = 0;
int sum = 0 ;
while(curr1!=null || curr2!=null || c>0){
    int a = curr1==null? 0 : curr1.val ;
    int b = curr2==null? 0 : curr2.val ; 
    sum = a+ b+c ;
    ListNode n = new ListNode(sum%10) ;
    prev.next = n ; 
    prev = n ; 
    c = sum/10 ;
    if(curr1!=null) curr1 = curr1.next ; 
    if(curr2!=null) curr2 = curr2.next ;
}
prev.next = null ; 
return dummy.next ; }}
