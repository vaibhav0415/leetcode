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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }


    public void reorderList(ListNode head) {
             ListNode slow=head;
          ListNode fast=head;
           while(fast.next!=null && fast.next.next!=null){
               slow=slow.next;
               fast=fast.next.next;
               
           }
           ListNode head1=head;
           ListNode head2=reverse(slow.next);
           slow.next=null;
           ListNode temp=new ListNode(0);
           ListNode t=temp;
           ListNode t1=head1;
           ListNode t2=head2;
           while(t1!=null && t2!=null){
              t.next=t1;
                t1=t1.next;
              t=t.next;
              t.next=t2;
                t2=t2.next;
              t=t.next;
            

           }
           if(t1==null){
            t.next=t2;
           }
           else{
            t.next=t1;
           }
          head=temp.next;


    }
}