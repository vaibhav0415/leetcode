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
    public ListNode insertionSortList(ListNode head) {
        //time O(n^2)
        //space O(n)
           ListNode dummy=new ListNode(0);
           ListNode temp=dummy;
           ListNode curr=head;
           ListNode nex=null;
           while(curr!=null){
                  nex=curr.next;
                  temp=dummy;
                  while(temp.next!=null && temp.next.val<curr.val){
                    temp=temp.next;
                  }
                  
                  curr.next=temp.next;
                  temp.next=curr;
                  curr=nex;

           }
           return dummy.next;

    }
}