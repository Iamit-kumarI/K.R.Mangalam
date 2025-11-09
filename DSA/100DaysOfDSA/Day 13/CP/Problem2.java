/*
 * Problem:1299. Replace Elements with Greatest Element on Right Side
 * Solution:https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/solutions/7336792/java-two-variables-beats-100-by-amitk300-hs1f
 */
public class Problem2 {

    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        int lastmax = max;
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i > -1; i--) {
            if (arr[i] > max) {
                lastmax = arr[i];
            }
            arr[i] = max;
            max = lastmax;

        }
        return arr;
    }
}
