class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;    
        int m = matrix[0].length;    

        int[] rowmark = new int[n];
        int[] colmark = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowmark[i] = 1;
                    colmark[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rowmark[i] == 1 || colmark[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}