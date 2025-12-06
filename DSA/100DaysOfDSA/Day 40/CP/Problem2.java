/*
* Problem:1047. Remove All Adjacent Duplicates In String
* Solution:https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/solutions/7394691/java-beats-100-stringbuilder-by-amitk300-pzi6
*/
public class Problem2 {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && sb.charAt(n - 1) == c) {
                sb.deleteCharAt(n - 1); 
            }else {
                sb.append(c);
            }
        }
        return sb.toString();

        //     int[]arr=new int[26];
        //     Arrays.fill(arr,0);
        //     arr=freqMap(s,0,arr);
        //     StringBuilder sb=new StringBuilder();
        //     return helper(arr,sb,0,s);
        // }
        // public String helper(int []arr,StringBuilder sb,int index,String s){
        //     if(index==s.length())return sb.toString();
        //     if(arr[s.charAt(index)-'a']!=0){
        //         sb.append(s.charAt(index));
        //         arr[s.charAt(index)-'a']=0;
        //     }
        //     return helper(arr,sb,index+1,s);
        // }
        // public int[]freqMap(String s,int index,int[]arr){
        //     if(index==s.length())return arr;
        //     if(arr[s.charAt(index)-'a']>0)arr[s.charAt(index)-'a']--;
        //     else arr[s.charAt(index)-'a']++;
        //     return freqMap(s,index+1,arr);
    }

}
