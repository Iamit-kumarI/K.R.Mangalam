/*
* Problem:Factorial
* Solution:https://www.geeksforgeeks.org/problems/factorial5739/1
*/
public class Problem2 {
    int factorial(int n) {
        // code here
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

