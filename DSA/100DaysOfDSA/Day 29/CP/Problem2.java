/*
* Problem:242. Valid Anagram
* Solution: https://leetcode.com/problems/valid-anagram/solutions/7372303/java-beats-100-asci-logic-by-zerogrind-jlw5
 */
public class Problem2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (arr[c - 'a'] < 1) {
                return false;
            }
            arr[c - 'a']--;
        }
        for (int val : arr) {
            if (val != 0) {
                return false;
            }
        }
        return true;
        // Map<Character,Integer> map=new HashMap<>();
        // for(char c:s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c:t.toCharArray()){
        //     if(!map.containsKey(c))return false;
        //     map.put(c,map.get(c)-1);
        //     if(map.get(c)==0)map.remove(c);
        // }
        // return map.isEmpty();
    }
}
