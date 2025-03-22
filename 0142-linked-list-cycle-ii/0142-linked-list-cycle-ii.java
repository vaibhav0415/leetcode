/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null){
            if(slow.next==null) return null;
            slow=slow.next;
            if(fast.next==null) return null;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        while(temp!=slow){
            if(slow.next==null) return null;
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
    }
}