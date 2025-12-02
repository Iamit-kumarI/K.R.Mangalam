/*
* Problem: Count Digits
* Solution:https://discuss.geeksforgeeks.org/comment/f59af004-ffbe-47d9-bd3c-7af2fdeb982f/practice
 */
public class Problem1 {

    static int evenlyDivides(int n) {
        // code here
        return helper(n, 0, n);
    }
    public static int helper(int n, int count, int div) {
        if (div == 0) {
            return count;
        }
        int rem = div % 10;
        if (!(rem == 0) && n % rem == 0) {
            count++;
        }
        return helper(n, count, div / 10);
    }
}
