/*
 * Problem:2161. Partition Array According to Given Pivot
 * Solution:https://leetcode.com/problems/partition-array-according-to-given-pivot/solutions/7331546/java-two-pointers-beats-100-by-amitk300-ypz8
 */
public class Problem1 {
    public int[] pivotArray(int[] nums, int pivot) {
        //3 pointer Approach
        int n = nums.length;
        int lindex = 0, eindex = 0;
        for (int val : nums) {
            if (val < pivot) {
                lindex++;
            }
            if (val == pivot) {
                eindex++;
            }
        }
        int[] ans = new int[n];
        int lessIndex = 0, eqqualindex = lindex, greaterindex = lindex + eindex;
        for (int val : nums) {
            if (val < pivot) {
                ans[lessIndex++] = val; 
            }else if (val == pivot) {
                ans[eqqualindex++] = val; 
            }else {
                ans[greaterindex++] = val;
            }
        }
        return ans;
    }
}
