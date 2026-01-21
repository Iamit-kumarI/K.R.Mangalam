/*
* Problem:Reverse Polish Notation (RPN evaluator)
* Solution:https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/1881618397/
*/

import java.util.Stack;

public class Problem2{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(calculate(b, a, s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }
    }
}