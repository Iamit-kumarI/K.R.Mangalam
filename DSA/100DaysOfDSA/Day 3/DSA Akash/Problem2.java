/*
 * Problem: 509. Fibonacci Number
 * Solution:https://leetcode.com/problems/fibonacci-number/solutions/7308982/java-beats-100-1d-dp-by-zerogrind-cb3r
 */
import java.util.Arrays;

class Problem2 {

    public int fib(int n) {
        /* TC - 0(2^n)
        if(n<2)return n;
        return fib(n-1)+fib(n-2);
         */
        //OPTIMISED BY DP
        // TC O(N)
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return helper(n, arr);
    }

    public int helper(int n, int[] dp) {
        if (n < 2) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }
}
