class Solution {
public:
    int minMoves(vector<int>& nums) {
        //do reverse of what ques is trying to say
        int mn=INT_MAX;
        for(int i=0;i<nums.size();i++){
            mn=min(mn,nums[i]);
        }
        int moves=0;
        for(int i=0;i<nums.size();i++){
                 moves+=abs(mn-nums[i]);
        }
        return moves;
    }
};