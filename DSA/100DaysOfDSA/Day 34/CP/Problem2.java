/*
* Problem:2185. Counting Words With a Given Prefix
* Solution:https://leetcode.com/problems/counting-words-with-a-given-prefix/solutions/7382736/java-beats-100-string-by-amitk300-yql5
*/
public class Problem2 {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String str:words)if(str.startsWith(pref))count++;
        return count;
    }
}