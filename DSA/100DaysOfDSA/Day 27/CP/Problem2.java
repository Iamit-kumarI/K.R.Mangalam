/*
* Problem:Most Frequent Character
* Solution:https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
*/
public class Problem2 {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] freq = new int[26];
        int max = 0, lastmax = 0;
        int index = 0;
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            if (freq[c - 'a'] >= max) {
                lastmax = max;
                index = c - 'a';
                max = freq[c - 'a'];
            }
        }
        if (max > lastmax) {
            return (char) ('a' + index);
        }
        if (max == lastmax) {
            int i = 0;
            for (int val : freq) {
                if (val == max) {
                    return (char) ('a' + i); 
                }else {
                    i++;
                }
            }
        }
        return ' ';
    }
}
