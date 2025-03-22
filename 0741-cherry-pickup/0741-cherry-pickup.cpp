#define ll long long int
class Solution {
public:
    int neg = INT_MIN;  // negative infinity for base case
    ll n, m;            // dimensions of input matrix
    vector<vector<int>> mat;  // input matrix
    ll dp[55][55][55];  // DP table

    ll f(ll i, ll j, ll x, ll y) {
        // Base case checks
        if (i >= n || j >= m || x >= n || y >= m || mat[i][j] == -1 || mat[x][y] == -1) 
            return neg;

        // If we reached the bottom-right corner of the grid
        if (i == n - 1 && j == m - 1) {
            return mat[i][j] == 1;  // Return 1 if there's a cherry
        }

        // If the value has already been computed, return it
        if (dp[i][j][x] != -1) 
            return dp[i][j][x];

        ll result = neg;  // Initialize result to negative infinity

        // Try all four possible movements (down-right, right-down)
        result = max(result, f(i + 1, j, x + 1, y));  // Move down-right
        result = max(result, f(i + 1, j, x, y + 1));  // Move right-down
        result = max(result, f(i, j + 1, x + 1, y));  // Move down-right
        result = max(result, f(i, j + 1, x, y + 1));  // Move right-down

        // If no valid result, return the neg value
        if (result == neg) 
            return dp[i][j][x] = neg;

        result += (mat[i][j] == 1);  // Add 1 if a cherry is at (i, j)
        result += (mat[x][y] == 1);  // Add 1 if a cherry is at (x, y)

        // Remove repetition if the same cell is visited twice
        if (i == x && j == y && mat[i][j] == 1) 
            result--;

        return dp[i][j][x] = result;
    }

    int cherryPickup(vector<vector<int>>& grid) {
        n = grid.size();
        m = grid[0].size();
        memset(dp, -1, sizeof dp);

        mat = grid;  // Initialize the matrix with the input grid
        // No need to resize mat or change its dimensions

        // Start the DP with both starting points at (0, 0)
        ll ans = f(0, 0, 0, 0);

        // If no cherries can be picked up, return 0
        return ans == neg ? 0 : ans;
    }
};
