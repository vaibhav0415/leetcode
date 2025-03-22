class Solution {
public:
    bool isPossible(vector<int>& target) {
        priority_queue<int> pq;
       long long s=0;
        for(int i=0;i<target.size();i++){
            pq.push(target[i]);
            s+=target[i];
        }
        while(pq.top()!=1 ){
            int curr=pq.top();
            pq.pop();
            long long remain=s-curr;
            long long replace=curr-remain;
            if(remain<1 ||replace<1) return false;
           
            if(curr%remain!=0) pq.push(curr%remain);
            else pq.push(remain);// most imp condition
            s=s-curr+(curr%remain);
        }
        return true;
    }
};