/*
* Problem: Fibonacci Using Recursion
* Solution:https://discuss.geeksforgeeks.org/comment/bb59a9b1-fc1a-40b5-9eab-36aad2753f41/practice
*/
import java.util.Arrays;
class Problem1 {

    static int nthFibonacci(int n) {
        // code here
        // if(n<=1)return n;
        // return nthFibonacci(n-1)+nthFibonacci(n-2);
        //over lapping sub problems lets optimse using dp
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return helper(n, arr);
    }

    public static int helper(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
    }
}
