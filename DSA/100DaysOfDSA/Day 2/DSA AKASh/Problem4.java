/*
 * Problem:202. Happy Number
 * Solution -> https://leetcode.com/problems/happy-number/solutions/7307346/java-fast-slow-pointer-beats-100-by-zero-7bhp
 */
public class Problem4 {
    public boolean isHappy(int n) {
        // lets apply fast and slow pointers
        int slow = n, fast = n;
        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        } while (slow != fast);// till no raching in the loop at the same no
        return slow == 1 ? true : false;
    }

    public int squareOfDigits(int n) {
        int ans = 0;
        while (n > 0) {
            ans += (n % 10) * (n % 10);
            n /= 10;
        }
        return ans;
    }
}
