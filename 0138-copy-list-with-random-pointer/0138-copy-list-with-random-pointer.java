/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // deep copy
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp = head;
        while (temp != null) {
            Node t = new Node(temp.val);
            temp2.next = t;
            temp2 = t;
            temp = temp.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp = head;
        // alternate connection
        Node d = new Node(0);

        while (temp != null) {
            d.next = temp;
            temp = temp.next;
            d = d.next;

            d.next = temp2;
            temp2 = temp2.next;
            d = d.next;
        }
        temp2 = head2;
        temp = head;
        // random pinter
        while(temp != null) {
            if (temp.random == null)
                temp2.random = null;
            else
                temp2.random = temp.random.next;
            temp = temp2.next;
            if (temp != null)
                temp2 = temp.next;
        }
        temp2 = head2;
        temp = head;
        // sperate list
        while (temp != null) {
            temp.next = temp2.next;
            temp = temp.next;
            if (temp == null) break;
            temp2.next = temp.next;
            if (temp2.next == null) break;
            temp2 = temp2.next;
        }
        return head2;

    }
}