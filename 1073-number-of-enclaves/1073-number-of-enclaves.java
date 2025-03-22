class Solution {
    int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

    public int numEnclaves(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1) {
                    if (board[i][j] == 1)
                        bfs(board, i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1)
                    count++;

            }
        }
        return count;
    }

    void bfs(int[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { r, c });
        grid[r][c] = 0;
        while (q.size() > 0) {
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            for (int[] dir : direction) {
                int newrow = row + dir[0];
                int newcol = col + dir[1];
                if (newrow < 0 || newcol < 0 || newrow >= grid.length || newcol >= grid[0].length
                        || grid[newrow][newcol] == 0)
                    continue;
                q.add(new int[] { newrow, newcol });
                grid[newrow][newcol] = 0;
            }
        }
    }
}