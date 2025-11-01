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
    public ListNode modifiedList(int[] nums, ListNode head) {
        // ListNode temp2 = head;
        // ListNode next = null;
        // int l =0;
        // while(temp2!=null){
        //     l++;
        //     temp2=temp2.next;
        // }
        // for(int i=0;i<nums.length;i++){
        //     ListNode temp = head;
        //     while(temp.next!=null){
        //         if(nums[i]==head.val){
        //             head = head.next;
        //             temp = head;
        //         }
        //         else if(nums[i]==temp.next.val){
        //               temp.next = temp.next.next;
        //         }
        //         else{
        //             temp= temp.next;
        //         }
        //     }
        // }
        // return head;}}
       Set<Integer> targets = new HashSet<>();
for (int x : nums) targets.add(x);

ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy, curr = head;

while (curr != null) {
    if (targets.contains(curr.val)) {
        prev.next = curr.next;
        curr = prev.next;
    } else {
        prev = curr;
        curr = curr.next;
    }
}

return dummy.next;}}