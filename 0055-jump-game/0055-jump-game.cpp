class Solution {
public:
    bool canJump(vector<int>& nums) {
        // T.C.:-O(n)
        //S.C. :-O(1)
        int maxInd=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(i>maxInd) return false; // very very imp // agar aap us index tak pahuch nahi sakte  toh uske agle tak pahuchne ka sawal hi peda nahi hota
            maxInd=max(i+nums[i],maxInd);
        }
        return true;
    }
};