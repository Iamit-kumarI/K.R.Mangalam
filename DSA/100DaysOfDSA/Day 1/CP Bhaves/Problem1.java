/*
 * Problem: Largest Element in the Arrays(not sorted)
 *  gfg: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
 *  profile: https://www.geeksforgeeks.org/user/akumar300/
 * Approach 1: Sorting O(nlogn) 
 *          Sort the arrays  (asc, des) order
 *          element at the last index  of first is ans
 * 
 * Approach 2:Iterative traversal O(n)
 *          comparison way
 * 
*/
/* Approach 1 */
// class Solution {
//     public static int largest(int[] arr) {
//         // code here
//         Arrays.sort(arr);
//         return  arr[arr.length-1];
//     }
// }

/* Approach 2 */
class Solution {

    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}
