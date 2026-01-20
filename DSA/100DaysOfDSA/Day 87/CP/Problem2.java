/*
* Problem: Minimum Add to Make Parentheses Valid
* Solution:https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/1762594344/
*/
import java.util.Stack;

public class Problem2 {

    public static void main(String[] args) {
        String str = "(((";
        System.out.println(minAddToMakeValid(str));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                }else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
