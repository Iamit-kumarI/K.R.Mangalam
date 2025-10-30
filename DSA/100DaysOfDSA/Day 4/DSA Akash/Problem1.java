// package DSA Akash;
/*
 * Problem:2733. Neither Minimum nor Maximum
 * Solution: https://leetcode.com/problems/neither-minimum-nor-maximum/solutions/7312826/java-best-solution-in-place-sorting-by-z-bwcg
 */
import java.util.Arrays;
public class Problem1 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length == 2) {
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
