class Problem2{
    //solution ->https://leetcode.com/problems/reverse-integer/solutions/7196590/java-beats-100-o-log-n
    //7. Reverse Integer
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            // for +ve limit
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && x % 10 > 7) {
                return 0;
            }
            // for -ve limit
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && x % 10 < -8) {
                return 0;
            }
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
}