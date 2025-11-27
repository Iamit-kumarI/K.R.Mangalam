/*
* Problem:844. Backspace String Compare
* Solution:https://leetcode.com/problems/backspace-string-compare/solutions/7378191/java-beats-100-stackcrazy-solution-by-am-u7zc
 */

import java.util.Stack;

public class Problem1 {

    public boolean backspaceCompare(String s, String t) {
        String str1 = remove(s);
        String str2 = remove(t);
        return str1.equals(str2);
    }

    public static String remove(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        for (char c : s.toCharArray()) {
            if (index != 0 && c == '#') {
                stack.pop();
                index--;
                continue;
            }
            if (c == '#') {
                continue;
            }
            index++;
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
