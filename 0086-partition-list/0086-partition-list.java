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
    public ListNode partition(ListNode head, int x) {
         ListNode lo=new  ListNode(1);
         ListNode hi=new  ListNode(1);
         ListNode tl=lo;
         ListNode th=hi;
         ListNode temp=head;
         while(temp!=null){
             if(temp.val<x){
                tl.next=temp;
                tl=temp; 
                temp=temp.next;
             }
              else{
                th.next=temp;
                th=temp; 
                temp=temp.next;
              }
         }
         tl.next=hi.next;
         th.next=null;
         return lo.next;
    }
}