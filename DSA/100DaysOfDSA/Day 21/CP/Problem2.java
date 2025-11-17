/*
 * Problem:162. Find Peak Element
 * Solution:https://leetcode.com/problems/find-peak-element/solutions/7351776/java-binary-search-beats-100-by-amitk300-fwq2
 */
public class Problem2 {
    public int findPeakElement(int[] nums) {
        // if(nums.length==1)return 0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]<nums[i-1])return i-1;
        // }
        // return nums.length-1;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1; 
            }else {
                end = mid;
            }
        }
        return start;
    }
}
