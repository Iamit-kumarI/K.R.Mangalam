/*
* Problem:Remove Spaces
* Solution:https://discuss.geeksforgeeks.org/comment/600d8843-1c44-44e8-9766-85a207ec8ed6/practice
*/
public class Problem2 {//by mistake i have put 29 nov its 30 nov day is 33
    String modify(String s) {
        // your code here
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
