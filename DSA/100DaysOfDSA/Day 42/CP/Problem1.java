/*
* Problem:Reverse a String
* Solution:https://discuss.geeksforgeeks.org/comment/dcabfb99-aaaf-4428-9906-172be5a29f5a/practice
*/
public class Problem1 {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        return helper(s,sb,s.length()-1);
    }
    public static String helper(String s,StringBuilder sb,int index){
        if(index<0)return sb.toString();
        return helper(s,sb.append(s.charAt(index)),index-1);
    }
}