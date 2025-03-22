class Solution {
public:
    int matrixScore(vector<vector<int>>& grid) {
        // to make first element of each row one
        int m = grid.size();
        int n = grid[0].size();
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1)
                        grid[i][j] = 0;
                    else
                        grid[i][j] = 1;
                }
            }
        }
        int noz = 0;
        int noo = 0;
        for (int j = 1; j < n; j++) {
            noz = 0;
            noo = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 0)
                    noz++;
                else
                    noo++;
            }
            if (noz > noo) {
                for (int i = 0; i < m; i++) {
                    if (grid[i][j] == 1)
                        grid[i][j] = 0;
                    else
                        grid[i][j] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int k = 1;
            for (int j = n-1; j>=0; j--) {

                sum += (grid[i][j] * k);
                k *= 2;
            }
        }
        return sum;
    }
};