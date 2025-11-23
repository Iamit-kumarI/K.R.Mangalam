/*
* Problem:387. First Unique Character in a String
* Solution:https://leetcode.com/problems/first-unique-character-in-a-string/solutions/7370310/java-beats-100-freq-array-by-zerogrind-lznm
*/
public class Problem1 {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int index = 0;
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
