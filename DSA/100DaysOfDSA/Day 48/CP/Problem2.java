
import java.util.Arrays;

/*
* Problem:Find Median in Row-Wise Sorted Matrix (conceptual)
* Solution:https://discuss.geeksforgeeks.org/comment/7f7c122e-2973-42d3-a090-1f8bb6c40f60/practice
*/
public class Problem2 {
    public int median(int[][] mat) {
        // code here
        // it is said mat is sorted row wise i think we can optimise this that will be done latter currently there are exams going on i am not going to do that right now
        int[] arr = new int[mat.length * mat[0].length];
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[index++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
