/*
 * Problem:88. Merge Sorted Array
 * Solution:https://leetcode.com/problems/merge-sorted-array/solutions/7331529/java-two-pointers-beats-100-by-amitk300-b099
 */
import java.util.*;
public class Problem2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 1 && m == 0 & n == 1) {
            nums1[0] = nums2[0];
            System.out.println(Arrays.toString(nums2));
            return;
        }
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index++];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
