/*
* Problem:Extended Euclidean Algorithm
* Solution:https://www.geeksforgeeks.org/problems/extended-euclidean-algorithm3848/1
*/
public class Problem2 {
    static int[] gcd(int a, int b) {
        //help taken need to dry run again
        if (b == 0) {
            return new int[]{a, 1, 0};
        }
        int[] arr = gcd(b, a % b);
        int gcd = arr[0];
        int newa = arr[1];
        int newb = arr[2];
        int b1 = newa - (a / b) * newb;
        return new int[]{gcd, newb, b1};
    }
}
