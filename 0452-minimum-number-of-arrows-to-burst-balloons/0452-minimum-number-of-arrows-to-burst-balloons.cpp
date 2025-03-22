// total-non-overlapping interval
// in this problem they have changed equal to condition
bool cmp(vector<int>& a, vector<int>& b) {
    return a[1] < b[1];
}
    class Solution {
    public:
        int findMinArrowShots(vector<vector<int>>& points) {
            int ans = 0;
            int n = points.size();
            sort(points.begin(), points.end(), cmp);
            int prevEndTime = points[0][1];
            for (int i = 1; i < n; i++) {
                if (points[i][0] <= prevEndTime) {
                    ans++;
                } else {
                    prevEndTime = points[i][1];
                }
            }
            return n - ans;
        }
    };