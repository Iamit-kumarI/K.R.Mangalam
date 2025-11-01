/*
 * Problem:268. Missing Number
 * Solution:https://leetcode.com/problems/missing-number/solutions/7316566/java-xor-beats-100-by-amitk300-cp2j
 */
public class Problem1 {
    public int missingNumber(int[] nums) {
        int xor = 0, index = 0;
        for (int val : nums) {
            xor ^= val ^ index;
            index++;
        }
        return xor ^ nums.length;
    }
}
