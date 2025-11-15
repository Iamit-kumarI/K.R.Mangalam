
import java.util.Arrays;
/*
 * Problem:Merge Sort
 * Solution:https://www.geeksforgeeks.org/problems/merge-sort/1
 */
public class Problem2 {

    void mergeSort(int arr[], int l, int r) {
        // code here
        int[] sortarray = helper(arr, l, r + 1);
        for (int i = 0; i < sortarray.length; i++) {
            arr[l + i] = sortarray[i];
        }
    }

    public int[] helper(int[] arr, int l, int r) {
        if (r - l <= 1) {
            return Arrays.copyOfRange(arr, l, r);
        }
        int m = l + (r - l) / 2;
        int[] left = helper(arr, l, m);
        int[] right = helper(arr, m, r);
        return merge(left, right);
    }

    public int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, index = 0;
        int[] sortedarr = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                //put left elem in new sorted array
                sortedarr[index++] = left[i++];
            } else {
                sortedarr[index++] = right[j++];
            }
        }
        //check which array becomes empty
        while (j < right.length) {
            sortedarr[index++] = right[j++];
        }
        while (i < left.length) {
            sortedarr[index++] = left[i++];
        }
        return sortedarr;
    }
}
