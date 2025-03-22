class Solution {
public:
    string reorganizeString(string s) {
        
        unordered_map<char,int> map;
        for(auto x:s){
            map[x]++;
        }
        priority_queue<pair<int,char>> pq;
        for(auto x:map) pq.push({x.second,x.first});
        string ans="";
        while(pq.size()>1){
            auto one=pq.top();pq.pop();
            auto two=pq.top();pq.pop();
            ans+=one.second;
            ans+=two.second;
            if(--one.first) pq.push({one.first,one.second}); 
            if(--two.first) pq.push({two.first,two.second});

        }
        if(pq.size()>0){
            if(pq.top().first>=2) return "";
            if(ans.size()>0 && pq.top().second==ans.back()) return "";
            else ans+=pq.top().second;
        }
        return ans;

    }
};