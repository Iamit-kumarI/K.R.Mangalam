/*
 * Problem:35. Search Insert Position
 * Solution:https://leetcode.com/problems/search-insert-position/submissions/1826288249/
 */
public class Problem1 {
        public int searchInsert(int[] nums, int target) {
            return binarySearch(nums, target);
        }

        public int binarySearch(int[] nums, int traget) {
            int start = 0, end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == traget) {
                    return mid;
                }
                if (nums[mid] < traget) {
                    start = mid + 1; 
                }else {
                    end = mid - 1;
                }
            }
            return start;
        }
}