/*
 * Problem:Array Leaders
 * Solution:https://discuss.geeksforgeeks.org/comment/493d10c3-770f-4166-96db-5475c4e49f98/practice
 */
import java.util.ArrayList;
import java.util.Collections;
public class Problem2 {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length - 1]);
        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
