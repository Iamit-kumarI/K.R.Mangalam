/*
* Problem:3407. Substring Matching Pattern
* Solution:https://leetcode.com/submissions/detail/1839894293/
 */
public class Problem1 {
    public boolean hasMatch(String s, String p) {
        //gpt solution
        int startIndex = p.indexOf('*');
        String before = p.substring(0, startIndex);
        String end = p.substring(startIndex + 1);

        int pos = helper(s, before);
        if (pos == -1) return false;

        if (!end.isEmpty()) {
            int epos = s.lastIndexOf(end);
            if (epos == -1) return false;
            if (epos < pos + before.length()) return false;
        }
        return true;
    }

    public static int helper(String given, String comp) {
        if (given.isEmpty()) return -1;        // FIXED

        if (given.startsWith(comp)) return 0;

        int sub = helper(given.substring(1), comp);
        return sub == -1 ? -1 : sub + 1;
    }
}
