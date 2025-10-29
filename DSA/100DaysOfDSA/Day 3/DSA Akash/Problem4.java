
import java.util.Arrays;

/*
 * Problem:1137. N-th Tribonacci Number
 * Solution: https://leetcode.com/problems/n-th-tribonacci-number/solutions/7309040/java-dp-recursion-deadly-combo-by-zerogr-ebts
 */
public class Problem4 {

    public int tribonacci(int n) {
        /*
        if(n==0)return 0;
        if(n<=2)return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
         */
        // getting tlc for 35/38 cases
        // optimise via dp
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return helper(n, arr);
    }

    public int helper(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = helper(n - 1, dp) + helper(n - 2, dp) + helper(n - 3, dp);
    }
}
