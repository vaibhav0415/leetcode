

class Solution {
    public Node connect(Node root) {
         if(root==null) return null;
         Node curr=root;
         while(curr.left!=null){
            Node  temp=curr;
            while(curr!=null){
                curr.left.next=curr.right;
                curr.right.next=(curr.next!=null)?curr.next.left:null;
                curr=curr.next;
            }
            curr=temp.left;
         }
         return root;
    }
}