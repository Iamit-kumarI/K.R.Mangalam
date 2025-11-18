/*
 * Problem:88. Merge Sorted Array
 * Solution:https://leetcode.com/problems/merge-sorted-array/solutions/7355902/java-loop-index-beats-100-by-zerogrind-vicr
 */
public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = n + m - 1;
        // int max=0;
        m -= 1;
        n -= 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[len--] = nums1[m--]; 
            }else {
                nums1[len--] = nums2[n--];
            }
        }
        while (n >= 0) {
            nums1[len--] = nums2[n--];
        }
    }
}
