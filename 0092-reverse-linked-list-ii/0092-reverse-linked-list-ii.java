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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        ListNode temp = head;
        int n = 1;
        while (temp != null) {
            if (n == left - 1)
                a = temp;
            if (n == left)
                b = temp;
            if (n == right)
                c = temp;
            if (n == right + 1)
                d = temp;

            n++;
            temp = temp.next;
        }
        if(a!=null) a.next=null;
        c.next=null;
        ListNode curr=b;
        ListNode prev=null;
        ListNode after=null;
        while(curr!=null){
               after=curr.next;
               curr.next=prev;
               prev=curr;
               curr=after;
        }
        if(a!=null) a.next=prev;
        b.next=d;

        if(a!=null) return head;
        return c;
    }
}