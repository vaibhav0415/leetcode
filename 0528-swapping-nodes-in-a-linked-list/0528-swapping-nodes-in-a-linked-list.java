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
    public ListNode swapNodes(ListNode head, int k) {
                    //time complexity :O(n)(optimize soln)
                    ListNode temp=head;
                    k--;
                    while(k-- >0){
                        temp=temp.next;
                    }
                    ListNode p1=temp.next;
                    ListNode p2=head;
                    while(p1!=null){
                        p1=p1.next;
                        p2=p2.next;
                    }
                    int var=temp.val;
                    temp.val=p2.val;
                    p2.val=var;
                    return head;
                    
    }
}