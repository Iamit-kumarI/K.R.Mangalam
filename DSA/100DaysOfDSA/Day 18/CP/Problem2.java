/*
 * Problem:Selection Sort
 * Solution:https://www.geeksforgeeks.org/problems/selection-sort/1
 */
public class Problem2 {
    void selectionSort(int[] arr) {
        // code here copy from gpt
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}