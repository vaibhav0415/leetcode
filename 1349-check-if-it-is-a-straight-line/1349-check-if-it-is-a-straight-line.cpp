class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 2; i < coordinates.size(); i++) {
            int dx2 = coordinates[i][0] - coordinates[i-1][0];
            int dy2 = coordinates[i][1] - coordinates[i-1][1];
            if (dy * dx2 != dx * dy2) {
                return false;
            }
        }
        return true;
    }
};
