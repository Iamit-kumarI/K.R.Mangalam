/*
 * Problem:Bubble Sort
 * Solution:https://www.geeksforgeeks.org/problems/bubble-sort/1
 */
public class Problem2 {
    public void bubbleSort(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
