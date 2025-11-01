/*
 * Problem:First Repeating Element
 * Solution:https://discuss.geeksforgeeks.org/comment/d4b394d6-9b0b-44cf-a6bc-90c55931a242/practice
 */
public class Problem2 {
    public static int firstRepeated(int[] arr) {
        // code here
        //10^6
        byte[] narray = new byte[1000001];
        for (int val : arr) {
            narray[val]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (narray[arr[i]] > 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
