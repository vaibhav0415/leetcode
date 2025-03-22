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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            l1= reverse(l1);
             l2=reverse(l2);
             
             int carry=0;
			 int sum=0;
		     ListNode result=new ListNode(0);
			 ListNode r=result;
			 while(l1!=null || l2!=null || carry>=1){
				     sum=0;
					 if(l1!=null){
                      sum+=l1.val;
					  l1=l1.next;
				 }
				 if(l2!=null){
					 sum+=l2.val;
					l2=l2.next;
				 }
                int s=sum+carry;
				carry=s/10;
				s=s%10;
				r.next=new ListNode(s);
				r=r.next;
				}
                result=result.next;
                result=reverse(result);
                return result;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nex = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
}