bool cmp(vector<int> &a,vector<int> &b){
    return a[0]<b[0];
    // start sorting
    //chotha wala end pehle lenge
}
class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
         int ans=0;
         sort(intervals.begin(),intervals.end(),cmp);
         int prevEndTime=intervals[0][1];
         for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]<prevEndTime){
                ans++;
                prevEndTime=min(intervals[i][1],prevEndTime);
            }else{
              prevEndTime=intervals[i][1];
            }
         }
         return ans;
    }
};