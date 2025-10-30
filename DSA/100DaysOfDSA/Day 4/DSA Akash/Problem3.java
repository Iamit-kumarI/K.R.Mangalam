// package DSA Akash;
/*
 * Problem:268. Missing Number
 * Solution: https://leetcode.com/problems/missing-number/solutions/7312901/java-xor-beats-100-by-zerogrind-bfum
 */
public class Problem3 {
    public int missingNumber(int[] nums) {
        int xor = 0, index = 0;
        for (int val : nums) {
            xor ^= index++ ^ val;
        }
        return xor ^ nums.length;
    }
}
