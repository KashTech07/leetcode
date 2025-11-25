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
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev=null;
    //     ListNode next=null;
    //     ListNode curr=head;
    //     while(curr!=null){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //     }
    //     head=prev;
    //     return head;
    // }

    public boolean isPalindrome(ListNode head) {
    //     if(head==null){
    //         return false;
    //     }
    //     if(head.next==null){
    //         return true;
    //     }
    //     ListNode slow=head;
    //     ListNode fast=head.next;
    //     while(fast!=null&&fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     ListNode mid=slow.next;
    //     ListNode fhead=head;
    //     ListNode shead= reverseList(mid);
    //     while(shead!=null){
    //         if(fhead.val!=shead.val){
    //             return false;
    //         }
    //         fhead=fhead.next;
    //         shead=shead.next;
    //     }
    //      return true;}}
    ListNode slow = head ;
    ListNode fast = head ;
    while(fast!=null&&fast.next!=null){
        slow = slow.next ;
        fast = fast.next.next ;
    }
    ListNode second = reverse(slow);
    ListNode temp2 = second ;
    ListNode temp1 = head;
    while(temp2!=null){
        if(temp1.val!=temp2.val){
            return false;
        }
        temp1=temp1.next;
        temp2 = temp2.next;
    }
    return true;}



    ListNode reverse(ListNode slow){
        ListNode prev = null ; 
        ListNode next = null ;
        ListNode curr = slow;
        while(curr!=null){
            next = curr.next ;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        }
        return prev ;
    }}