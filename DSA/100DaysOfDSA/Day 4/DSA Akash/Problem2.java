// package DSA Akash;
/*
 * Problem:344. Reverse String
 * Solution: https://leetcode.com/problems/reverse-string/solutions/7312855/java-two-pointer-beats-100-by-zerogrind-3qsj
 */
public class Problem2 {
    public void reverseString(char[] s) {
        //two pointer approach tc O(n)
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
