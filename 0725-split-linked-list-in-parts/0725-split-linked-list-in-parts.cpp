
class Solution {
public:
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
             vector<ListNode*> ans;
             //we calculated the length of the list
             int n=0;
             ListNode* temp=head;
             while(temp){
                n++;
                temp=temp->next;
             }
             temp=head;
             int size=n/k;
             int rem=n%k;
             while(temp!=NULL){
                ListNode* c=new ListNode(100);
                int s=size;
                ListNode* tempc=c;
                if(rem>0) s++;
                rem--;
                for(int i=1;i<=s;i++){
                        tempc->next=temp;
                        temp=temp->next;
                        tempc=tempc->next;
                }
                tempc->next=NULL;
                ans.push_back(c->next);
             }
             if(ans.size()<k){
                int extra=k-ans.size();
                for(int i=1;i<=extra;i++){
                    ans.push_back(NULL);
                }
             }
             return ans;

    }
};