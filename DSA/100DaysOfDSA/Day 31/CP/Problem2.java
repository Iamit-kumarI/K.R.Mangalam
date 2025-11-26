/*
* Problem:1297. Maximum Number of Occurrences of a Substring
* Solution: https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/solutions/7376475/java-beats-100-dp-by-amitk300-1z8j
 */
import java.util.*;//d
public class Problem2 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> freq = new HashMap<>();
        int n = s.length();
        int max = 0;
        for (int i = 0; i <= n - minSize; i++) {
            String str = s.substring(i, i + minSize);
            if (helper(str, maxLetters)) {
                freq.put(str, freq.getOrDefault(str, 0) + 1);
                max = Math.max(max, freq.get(str));
            }
        }
        return max;
    }

    private boolean helper(String str, int max) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
            if (set.size() > max) {
                return false;
            }
        }
        return true;
    }
}
