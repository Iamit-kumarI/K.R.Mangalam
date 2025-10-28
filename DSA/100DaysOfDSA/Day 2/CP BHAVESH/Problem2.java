/*
 * Problem:Min and Max in Array
 * Solution: https://discuss.geeksforgeeks.org/comment/6a1510a6-1c41-426d-a6e2-029f7675a628/practice
 * 
 */

import java.util.ArrayList;
class Problem2 {

    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        list.add(min);
        list.add(max);
        return list;
    }
}
