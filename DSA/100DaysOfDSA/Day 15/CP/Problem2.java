/*
 * Problem:Rotating an Array
 * Solution:https://discuss.geeksforgeeks.org/comment/d020ccf5-3b6e-417f-9dc6-7994ea5af8c8/practice
 */
import java.util.ArrayList;
public class Problem2 {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = d; i < arr.length + d; i++) {
            list.add(arr[i % n]);
        }
        int index = 0;
        for (int val : list) {
            arr[index++] = val;
        }
    }
}
