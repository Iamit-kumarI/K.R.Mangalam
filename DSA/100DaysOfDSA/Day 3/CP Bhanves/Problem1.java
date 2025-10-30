/**
 * Problme:189. Rotate Array
 * Solution: https://leetcode.com/problems/rotate-array/
 * 
 */

public class Problem1 {
    public void rotate(int[] nums, int k) {
        helper(nums, nums.length, k % nums.length);
    }

    public static void helperhelper(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void helper(int[] arr, int n, int k) {
        helperhelper(arr, 0, n - 1);
        helperhelper(arr, 0, k - 1);
        helperhelper(arr, k, n - 1);
    }

    //getting TLE
    //     k%=nums.length;
    //     helper(nums,k,nums.length);
    // }
    // public void helper(int []nums,int k,int len){
    //     if(k==0)return;
    //     int lastitem=nums[len-1];
    //     for(int i=len-1;i>0;i--){
    //         nums[i]=nums[i-1];
    //     }
    //     nums[0]=lastitem;
    //     helper(nums,k-1,len);
}
