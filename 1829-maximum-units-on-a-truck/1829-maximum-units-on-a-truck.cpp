 bool cmp(vector<int> &a ,vector<int> &b){
        return a[1]>b[1];
    }
class Solution {
public:
    
    int maximumUnits(vector<vector<int>>& boxtypes, int truckSize) {
        sort(boxtypes.begin(),boxtypes.end(),cmp);
        int profit=0;
        for(int i=0;i<boxtypes.size();i++){
            if(boxtypes[i][0]<=truckSize){
                profit+=boxtypes[i][1]*boxtypes[i][0];
                truckSize-=boxtypes[i][0];
            }
            else{
                profit+=truckSize*boxtypes[i][1];
                break;
            }
        }
        return profit;
        
    }
};