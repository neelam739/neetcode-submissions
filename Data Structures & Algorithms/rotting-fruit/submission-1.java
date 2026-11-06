

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1: Find rotten and fresh fruits
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2)
                    queue.offer(new int[]{i, j});

                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };

        // Step 2: Spread rot every minute
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();

                for (int[] d : directions) {
                    int r = cell[0] + d[0];
                    int c = cell[1] + d[1];

                    if (r >= 0 && r < rows &&
                        c >= 0 && c < cols &&
                        grid[r][c] == 1) {

                        grid[r][c] = 2;
                        fresh--;
                        queue.offer(new int[]{r, c});
                    }
                }
            }
            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
