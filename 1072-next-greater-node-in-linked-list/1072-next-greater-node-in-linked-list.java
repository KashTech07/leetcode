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
    public int[] nextLargerNodes(ListNode head) {
       ListNode temp=head;
       ListNode temp2=head;
       int n=0;
       while(temp!=null){
        n++;
        temp=temp.next;
       }
       int[] res=new int[n];
       int x=0;
       while(temp2.next!=null){
        ListNode pointer=temp2.next;
        while(pointer!=null){
        if(temp2.val<pointer.val){
           res[x++]=pointer.val;
           break;
        }
        else{
            pointer=pointer.next;
        }
       }
       if(pointer==null){
        res[x++]=0;
       }
       temp2=temp2.next; 
    }
     return res;
}}