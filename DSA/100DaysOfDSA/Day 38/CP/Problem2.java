/*
* Problem:Sum of Array
* Solution:https://discuss.geeksforgeeks.org/comment/966f5750-8d81-4c0f-9537-4ac083b70b61/practice
*/
public class Problem2 {
    int arraySum(int arr[]) {
        // code here
        return helper(arr, 0);
    }

    public int helper(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + helper(arr, index + 1);
    }
}
