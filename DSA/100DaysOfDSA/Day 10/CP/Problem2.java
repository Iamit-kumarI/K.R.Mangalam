package CP;

/*
 * Problem:34. Find First and Last Position of Element in Sorted Array
 * Solution:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/7329380/java-binarysearch-beats-100-by-amitk300-8j3h
 */
public class Problem2 {

    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1, result = -1;
        int[] arr = {-1, -1};
        arr[0] = binarySearchLessThan(nums, target, start, end, result);
        arr[1] = binarySearchGreaterThan(nums, target, start, end, result);
        return arr;
    }

    public int binarySearchLessThan(int[] nums, int target, int start, int end, int result) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public int binarySearchGreaterThan(int[] nums, int target, int start, int end, int result) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
