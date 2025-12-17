/*
* Problem:Replace Elements with Sum of Row/Col (basic)
* Solution:https://www.geeksforgeeks.org/problems/generate-a-matrix-with-each-row-and-column-of-given-sum/1
*/

// User function Template for Java
class Problem2 {

    public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
        int n = rowSum.length, m = colSum.length;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int cur = Math.min(rowSum[i], colSum[j]);
                arr[i][j] = cur;
                rowSum[i] -= cur;
                colSum[j] -= cur;
            }
        }
        return arr;
    }
}
