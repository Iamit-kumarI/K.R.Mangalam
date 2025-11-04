/*
 * Problem: Second Largest
 * Solution: https://discuss.geeksforgeeks.org/comment/35f4ab4a-e234-45cd-9c35-2b30aab0f52c/practice
 */
public class Problem1 {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = 0, prevMax = 0;
        for (int val : arr) {
            if (val > max) {
                prevMax = max;
                max = val;
            }
            if (val > prevMax && val != max) {
                prevMax = val;
            }
        }
        return prevMax == 0 ? -1 : prevMax;
    }
}
