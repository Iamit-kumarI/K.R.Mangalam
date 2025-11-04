/*
 * Problem:283. Move Zeroes
 * Solution: https://leetcode.com/problems/move-zeroes/solutions/7325520/java-two-pointer-beats-100-by-amitk300-4bi1
 */
public class Problem2 {

    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[start++] = nums[i];
            }
        }
        while (start < nums.length) {
            nums[start++] = 0;
        }
    }
}
