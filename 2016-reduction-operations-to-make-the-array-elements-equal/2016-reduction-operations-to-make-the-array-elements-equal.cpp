class Solution {
public:
    int reductionOperations(vector<int>& nums) {
       
   unordered_map<int, int>map;
  for(int x:nums) map[x]++;
  priority_queue<pair<int, int>>pq;
  for(auto x:map){
      pq.push({x.first, x.second});
  }
  int ans=0;
  while(pq.size()>1){
    int largest_f=pq.top().second;
    pq.pop();
    int second_lar=pq.top().first;
    int second_lar_f=pq.top().second;
    pq.pop();

    ans+=largest_f;
    pq.push({second_lar, second_lar_f+largest_f});
  }
  return ans;
    }
};