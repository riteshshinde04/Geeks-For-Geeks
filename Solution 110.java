class Solution {
    public int findCoverage(int[][] matrix) {
        // code here
        int rows = matrix.length;
        int col = matrix[0].length;
        int count= 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    if (j > 0 && matrix[i][j - 1] == 1) {
                        count++;
                    }
                    if (j < col- 1 && matrix[i][j + 1] == 1) {
                        count++;
                    }
                    if (i > 0 && matrix[i - 1][j] == 1) {
                        count++;
                    }
                    if (i < rows - 1 && matrix[i + 1][j] == 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}