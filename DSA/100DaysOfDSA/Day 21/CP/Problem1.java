
import java.util.Arrays;

/*
 * Problem:Kth Smallest
 * Solution:https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
 */
public class Problem1 {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
