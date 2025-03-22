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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp1 = head;
        int size = 1;
        while (temp1.next != null) {
            temp1= temp1.next;
            size++;
        }
        temp1.next = head;
        k = k % size;
        ListNode temp2 = head;
        for (int i = 0; i < size - k - 1; i++) {
            temp2 = temp2.next;
        }
        
        head = temp2.next;
        temp2.next = null;
        

        return head;

    }
}