#define pp pair<int,int>
class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> map;
        for(int i:nums){
            map[i]++;
        }
        priority_queue<pp,vector<pp>,greater<pp>> pq;
        for(auto x:map){
            pq.push({x.second,x.first});
            if(pq.size()>k) pq.pop();
        }
        vector<int> v;
        while(pq.size()>0){
            v.push_back(pq.top().second);
             pq.pop();
        }
        return v;
    }
};