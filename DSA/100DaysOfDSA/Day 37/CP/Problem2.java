/*
* Problem:1370. Increasing Decreasing String
* Solution:https://leetcode.com/problems/increasing-decreasing-string/solutions/7387468/java-beats-100-freq-by-amitk300-e6jf
*/
class Problem2 {

    public String sortString(String s) {
        int[] freq = new int[26];
        int max = 0;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] > max) {
                max = freq[c - 'a'];
            }
        }
        StringBuilder sb = new StringBuilder();
        while (max-- > 0) {
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) ('a' + i));
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) ('a' + i));
                    freq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
