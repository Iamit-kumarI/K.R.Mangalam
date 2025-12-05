/*
* Problem: Tower Of Hanoi
* Solution: https://discuss.geeksforgeeks.org/comment/a5d3b902-97df-4b68-a50b-804b09f5f3db/practice
*/
public class Problem2 {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        return helper(n);
    }
    public int helper(int n) {
        if (n == 0) {
            return 0;
        }
        int cur = helper(n - 1);
        return cur * 2 + 1;
    }
}