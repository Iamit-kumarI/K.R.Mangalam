import java.util.ArrayList;
import java.util.List;
/*
* Problem:54. Spiral Matrix
* Solution:https://leetcode.com/problems/spiral-matrix/submissions/1851992921/
*/
public class Problem2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0;
        int botton = matrix.length - 1, right = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (top <= botton && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= botton; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= botton) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[botton][i]);
                }
                botton--;
            }
            if (left <= right) {
                for (int i = botton; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
