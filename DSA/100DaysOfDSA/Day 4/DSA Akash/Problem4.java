// package DSA Akash;
/*
 * Problem:283. Move Zeroes
 * Solution: https://leetcode.com/problems/move-zeroes/submissions/1815763311/
 */
public class Problem4 {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (start != i) {
                    //swap
                    int temp = nums[start];
                    nums[start] = nums[i];
                    nums[i] = temp;
                }
                start++;
            }
        }
    }
}
