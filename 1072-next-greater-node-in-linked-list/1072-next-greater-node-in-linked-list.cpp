/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
       
       ListNode* reverseLL(ListNode* head,int &length){
         ListNode* curr=head,*prev= NULL,*after=NULL;
         while(curr){
            length++;
            after=curr->next;
            curr->next=prev;
            prev=curr;
            curr=after;
         }
         return prev;
         }
    vector<int> nextLargerNodes(ListNode* head) {
         // reverse ll
         int length=0;
         head=reverseLL(head,length);
         // prev greater ele
         ListNode* temp=head;
         stack<int> st;
         vector<int> ans(length,0);
         int i=0;
         while(head){
            while(st.size()>0 && head->val>=st.top()){
                st.pop();
            }
            if(st.size()>0) ans[i]=st.top();
            st.push(head->val);
            head=head->next;
            i++;
         }
         reverse(ans.begin(),ans.end());
         return ans;
         
      
    }
};