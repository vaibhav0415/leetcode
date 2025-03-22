#define pp pair<int,int>
class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
          int n=score.size();
          priority_queue<pp> pq;
          for(int i=0;i<n;i++){
            pq.push({score[i],i});
          }
        int r=1;
         vector<string> ans(n);
         while(pq.size()>0){
            int idx = pq.top().second;
            pq.pop();
            if(r==1)  ans[idx]="Gold Medal";
            else if(r==2) ans[idx]="Silver Medal";
             else if(r==3)  ans[idx]="Bronze Medal";
            else      ans[idx]=to_string(r);
            r++;
         }
           
           return ans;
    }
};