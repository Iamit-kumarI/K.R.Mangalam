// package DSA Akash;
/*
 * Problem:485. Max Consecutive Ones
 * Solution: https://leetcode.com/problems/max-consecutive-ones/solutions/7315005/java-array-beats-100-by-amitk300-wv0t
 */
public class Problem1 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxfreq = 0;
        int freq = 0;
        for (int val : nums) {
            if (val == 1) {
                freq++;
            } else {
                freq = 0;
            }
            maxfreq = Math.max(freq, maxfreq);
        }
        return maxfreq;
    }
}
