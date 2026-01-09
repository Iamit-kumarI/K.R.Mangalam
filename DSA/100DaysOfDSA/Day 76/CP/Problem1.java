/*
* Problem:Valid Parentheses
* Solution:https://leetcode.com/problems/valid-parentheses/submissions/1880076290/
*/
import java.util.Stack;

public class Problem1 {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' && !stack.isEmpty() && stack.pop() != '(') {
                return false;
            }
            if (c == '}' && !stack.isEmpty() && stack.pop() != '{') {
                return false;
            }
            if (c == ']' && !stack.isEmpty() && stack.pop() != '[') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
