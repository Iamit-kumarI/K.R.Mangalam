/*
 * Problem:Counting Sort
 * Solution:https://www.geeksforgeeks.org/problems/counting-sort/1
 */
public class Problem2 {
    public static String countSort(String s) {
        int[] count = new int[26];
        //copy from gpt
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
