/*
 * Problem:Remove Duplicates from unsorted array
 * Solution:https://discuss.geeksforgeeks.org/comment/ce4f2748-e660-4707-9662-a158594ba640/practice
 */
import java.util.*;
public class Problem1{
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        // for(int val:arr){
        //     if(!list.contains(val))list.add(val);
        // }
        // return list;
        Set<Integer> set = new LinkedHashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        list.addAll(set);
        return list;
    }
}
