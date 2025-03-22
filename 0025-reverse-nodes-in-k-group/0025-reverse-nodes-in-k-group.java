/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = length(head);
        if (head == null && len < k)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = dummy;
        ListNode after = dummy;
        while (len >= k) {
            curr = prev.next;
            after = curr.next;
            for (int i = 1; i < k; i++) {
                curr.next = after.next;
                after.next = prev.next;
                prev.next = after;
                after = curr.next;
            }
            prev = curr;
            len -= k;
        }
        return dummy.next;

    }

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}