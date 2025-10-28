/*
 * Problem:-> 9. Palindrome Number
 * Solution:-> https://leetcode.com/problems/palindrome-number/solutions/7200282/java-beats-100-o-log-n
 */
class Problem3 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0, given = x;
        while (x != 0) {
            // if(rev>Integer.MAX_VALUE||rev==Integer.MIN_VALUE/10&&x%10>7) 
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return given == rev;
    }
}
