/*
 * Problem:Factorial
 * Solution: https://discuss.geeksforgeeks.org/comment/5d88ec45-d24e-4cb8-bd6f-c6b2c62b7410/practice
 */
public class Problem1 {
    int factorial(int n) {
        // code here
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
