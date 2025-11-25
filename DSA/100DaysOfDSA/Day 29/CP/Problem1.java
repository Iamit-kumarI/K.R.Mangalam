/*
* Problem:151. Reverse Words in a String
* Solution:https://leetcode.com/problems/reverse-words-in-a-string/solutions/7372174/java-beats-100-stringbuilder-by-zerogrin-giym
 */
class Problem1 {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
