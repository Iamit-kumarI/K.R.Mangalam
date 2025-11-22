/*
* Problem:1941. Check if All Characters Have Equal Number of Occurrences
* Solution:https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/solutions/7363541/java-string-beats-100-by-amitk300-2u0g
 */

import java.util.Arrays;

class Problem1 {
    public boolean areOccurrencesEqual(String s) {
        int[]arr=new int[26];
        Arrays.fill(arr,0);
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int freq=arr[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(arr[i]==0)continue;
            else if(arr[i]!=freq)return false;
        }
        return true;
    }
}