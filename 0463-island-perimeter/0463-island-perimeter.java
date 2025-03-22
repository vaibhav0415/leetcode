class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // Check all four sides for water or out of bounds
                    if (i == 0 || grid[i - 1][j] == 0) perimeter++; // Top side
                    if (i == row - 1 || grid[i + 1][j] == 0) perimeter++; // Bottom side
                    if (j == 0 || grid[i][j - 1] == 0) perimeter++; // Left side
                    if (j == col - 1 || grid[i][j + 1] == 0) perimeter++; // Right side
                }
            }
        }
        
        return perimeter;
    }
}
