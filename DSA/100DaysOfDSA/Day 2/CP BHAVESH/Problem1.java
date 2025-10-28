/*
 * Problem:1480. Running Sum of 1d Array
 * Solution: https://leetcode.com/problems/running-sum-of-1d-array/solutions/7168855/java-beats-100-o-n
 * 
 */
class Problem1 {

    public int[] runningSum(int[] nums) {
        //Day 2
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
