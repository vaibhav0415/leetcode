#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        unordered_map<int, int> map;
        int count = 0;
        for (auto x : nums) {
            map[x]++;
        }
    
       for(auto x: nums){
           int diff=k-x;
           if(diff==x) {
            count+=map[diff]/2;
            map.erase(diff);
            }
            else if(map.count(diff)){
                        count+=min(map[diff],map[x]);
                        map.erase(diff);
                        map.erase(x);
            }
       } 
       
        return count;
    }
};
