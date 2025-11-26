/*
* Problem:796. Rotate String
* Solution:https://leetcode.com/problems/rotate-string/solutions/7374928/java-beats-100-string-by-amitk300-b6bk
 */
public class Problem2 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        //int st=s.indexOf(goal.charAt(0));
        //if(st==-1)return false;
        //int reach=st,size=s.length();
        // StringBuilder sb=new StringBuilder();
        //  do{
        // sb.append(s.charAt(st++));
        // st%=size;
        //}while(reach!=st);
        //return sb.toString().equals(goal);
        return (s + s).contains(goal);
    }
}
