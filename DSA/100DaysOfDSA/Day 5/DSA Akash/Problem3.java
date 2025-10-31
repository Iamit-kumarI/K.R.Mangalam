// package DSA Akash;
/*
 * Problem:628. Maximum Product of Three Numbers
 * Solution: https://leetcode.com/problems/maximum-product-of-three-numbers/solutions/7315056/java-array-beats-100-by-amitk300-jcjm
 */
import java.util.*;
public class Problem3 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro1 = nums[0] * nums[1] * nums[nums.length - 1];
        int pro2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
        return pro1 > pro2 ? pro1 : pro2;
    }
}
