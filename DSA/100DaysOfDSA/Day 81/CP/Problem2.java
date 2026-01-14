/*
* Problem:Parentheses Balance (multiple types)
* Solution:https://leetcode.com/problems/generate-parentheses/submissions/1884558677/
*/

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    public static void helper(List<String> list, StringBuilder sb, int open, int close, int n) {
        if (sb.length() == 2 * n) {//string is formed of len 6 (,)
            list.add(sb.toString());
            return;
        }
        if (open < n) {//we have space to add (
            sb.append('(');
            helper(list, sb, open + 1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {//we have valid space to add )
            sb.append(')');
            helper(list, sb, open, close + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
