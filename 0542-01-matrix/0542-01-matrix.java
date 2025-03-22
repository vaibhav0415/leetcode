import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] distance = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        
        // Initialize the distance matrix and the queue
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (mat[r][c] == 0) {
                    distance[r][c] = 0;
                    queue.add(new int[]{r, c});
                } else {
                    distance[r][c] = -1; // Mark as unvisited
                }
            }
        }
        
        // Directions for moving in the 4 adjacent cells (up, down, left, right)
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        // Perform BFS from all 0 cells
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check if the new cell is within bounds and unvisited
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && distance[newRow][newCol] == -1) {
                    // Update the distance of the cell
                    distance[newRow][newCol] = distance[row][col] + 1;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
        
        return distance;
    }
}
