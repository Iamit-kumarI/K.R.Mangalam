/*
 * Problem:Sum Of Digits
 * Gfg -> https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
 */
public class Problem1 {

    //sum of digits
    static int sumOfDigits(int n) {
        // code here
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
