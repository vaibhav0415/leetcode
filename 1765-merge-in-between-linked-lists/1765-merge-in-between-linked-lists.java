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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;//here we will store node a-1
        ListNode temp2=list1;//here we will store node b+1
        for(int i=0;i<b+1;i++){
            if(i<a-1) temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1.next=list2;
         ListNode tail2=list2;
        while(tail2.next!=null){
            tail2=tail2.next;
        }
        tail2.next=temp2;
        return list1;
    }
}