/*
 * Problem:Search in a Row-Column sorted matrix
 * Solution:https://discuss.geeksforgeeks.org/comment/21a9a22e-18e0-4b00-b79b-8e0885fd837a/practice
 */
public class Problem1 {
    public static boolean matSearch(int mat[][], int x) {
        boolean found = false;
        // your code here
        for (int[] arr : mat) {
            if (binarySearch(arr, x)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true; 
            }else if (arr[mid] < target) {
                start = mid + 1; 
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}