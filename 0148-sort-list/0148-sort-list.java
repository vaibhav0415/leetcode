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
    public ListNode merge(ListNode list1, ListNode list2) {
       ListNode t1=list1;
       ListNode t2=list2;
       ListNode h=new ListNode(0);
       ListNode t=h;
       while(t1!=null && t2!=null){
           if(t1.val<t2.val){
               t.next=t1;
               t=t1;
               t1=t1.next;
           }else{
               t.next=t2;
               t=t2;
               t2=t2.next;
           }
       } 
       if(t1==null){
           t.next=t2;

       }
       else{
           t.next=t1;
       }
       return h.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
        ListNode a=head;
        ListNode b=slow.next;
        slow.next=null;
        a=sortList(a);
        b=sortList(b);
        ListNode c=merge(a,b);
        return c;
        
       }   

    
}