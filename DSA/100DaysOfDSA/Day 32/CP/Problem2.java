/*
* Problem:392. Is Subsequence
* Solution: https://leetcode.com/problems/is-subsequence/solutions/7378221/java-beats-100-string-by-amitk300-qvg9
*/
public class Problem2 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int lastindex = -1;
        for (char c : s.toCharArray()) {
            int cur = t.indexOf(c, lastindex + 1);
            if (cur == -1) {
                return false;
            }
            lastindex = cur;
        }
        return true;
    }
}
