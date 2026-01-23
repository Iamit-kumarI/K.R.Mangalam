/*
* Problem:Check Parentheses Depth
* Solution:https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/solutions/7517036/beats-100-java-solution-by-amitk300-ctjs
*/

import java.util.Stack;

public class Problem2 {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c); 
            }else if (c == ')') {
                stack.pop(); 
            }else {
                continue;
            }
            max = Math.max(max, stack.size());
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
