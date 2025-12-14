/*
* Problem:Transpose of a Matrix
* Solution:https://leetcode.com/problems/transpose-matrix/submissions/1854924559/
*/

public class Problem2 {

    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length, n = matrix.length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}
