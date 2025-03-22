class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
         unordered_map<int,int> map;
         for(auto &num:nums){
            map[num]++;
         }
          vector<int> ans;
        for(auto &num:nums){
           int c=map[num];
           if(c==1) ans.push_back(num);   
        }
        return ans;
    }
};