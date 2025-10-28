/*
 * Problem: Largest Element in the Arrays(not sorted)
 *  gfg: https://www.geeksforgeeks.org/problems/reverse-an-array/1
 *  profile: https://www.geeksforgeeks.org/user/akumar300/
 * 
 * 
 * Approach 1: TC: O(N) SC O(N)
 *          Arrays traversal + Copy
 *          Make and new array array of size n
 *          traverse from end to start by the given array
 *          at each traversal store the element int the array newly create
 *          
 * 
 * Approach 2: TC O(N/2) -> O(N) SC (1)
 *          Two Pointer
 *          take two pointer start and end and keep swapping
 *          both [pointer] values till start>=end
 */
//Approach 2
class Solution {

    public void reverseArray(int arr[]) {
        // code here
        int start = 0, end = arr.length - 1;
        while (start < end) {
            //swap end - start
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
    }
}




//Approach 1
// class Solution {

//     public void reverseArray(int arr[]) {
//         // code here
//         int[] rev = new int[arr.length];
//         int index = arr.length - 1;
//         for (int val : arr) {
//             rev[index--] = val;
//         }
//         // arr=rev;
//         //need to copy the array
//         for (int i = 0; i < rev.length; i++) {
//             arr[i] = rev[i];
//         }
//     }
// }
