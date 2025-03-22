/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};
*/

class Solution {
public:
    Node* flatten(Node* head) {
         Node* temp=head;
         while(temp){
            Node *a=temp->next;
            if(temp->child!=NULL){
                Node* child=temp->child;
                temp->child=NULL;//important
                child=flatten(child);//recursion
                temp->next=child;
                child->prev=temp;
                while(child->next!=NULL){
                    child=child->next;
                }
                child->next=a;
                if(a) a->prev=child;//error 
            }
                 temp=a;

         }
         return head;
         //imp testcase
        // null 1 null
        // null 2 null
        // null 3 null
    }
};