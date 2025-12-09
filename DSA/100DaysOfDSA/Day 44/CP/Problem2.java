/*
* Problem:125. Valid Palindrome
* Solution:https://leetcode.com/problems/valid-palindrome/solutions/7401741/java-beats-100-recursion-by-amitk300-79le
*/
public class Problem2 {
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public static boolean helper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (!Character.isLetterOrDigit(s.charAt(start))) {
            return helper(s, start + 1, end);
        }
        if (!Character.isLetterOrDigit(s.charAt(end))) {
            return helper(s, start, end - 1);
        }
        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
            return false;
        }
        return helper(s, start + 1, end - 1);
    }
}
