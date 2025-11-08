/*
 * Can't Submit This Problem On TUF
 * Problem:Count Inversions
 */
public class Problem1 {
    public long numberOfInversions(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
