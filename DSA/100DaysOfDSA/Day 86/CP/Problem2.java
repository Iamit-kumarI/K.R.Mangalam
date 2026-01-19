/*
* Problem:Stack Permutations (concept)
* Solution:https://www.geeksforgeeks.org/problems/stack-permutations/1
*/
import java.util.Stack;

public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        int[] arr1 = {2, 3, 1};
        System.out.println(validateOp(arr, arr1));
    }

    public static boolean validateOp(int[] a, int[] b) {
        int bIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for (int val : a) {
            stack.push(val);
            while (!stack.isEmpty() && bIndex < b.length && stack.peek() == b[bIndex]) {
                stack.pop();
                bIndex++;
            }
        }
        return stack.isEmpty() && bIndex == b.length;
        // int bIndex = 0;
        // Stack<Integer> stack = new Stack<>();
        // for (int val : a) {
        //     if (val == b[bIndex]) {
        //         bIndex++;
        //         continue;
        //     } else {
        //         if (!stack.isEmpty() && stack.peek() == b[bIndex]) {
        //             stack.pop();
        //             bIndex++;
        //         } else {
        //             stack.push(val);
        //         }
        //     }
        // }
        // return stack.isEmpty();
    }
}
