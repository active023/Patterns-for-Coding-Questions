public class BiggestIsland {
    public int maxAreaOfIsland(int[][] matrix) {
        int biggestIslandArea = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    int currentArea = dfs(matrix, i, j);
                    biggestIslandArea = Math.max(currentArea, biggestIslandArea);
                }
            }
        }
        return biggestIslandArea;
    }

    private int dfs(int[][] matrix, int i, int j) {
        int count = 0;
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == 0) {
            return count;
        }
        matrix[i][j] = 0;
        count++;
        count += dfs(matrix, i + 1, j);
        count += dfs(matrix, i - 1, j);
        count += dfs(matrix, i, j - 1);
        count += dfs(matrix, i, j + 1);
        return count;
    }
}
