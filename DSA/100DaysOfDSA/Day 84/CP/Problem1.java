/*
* Problem:Simplify Path (stack)
* Solution:https://leetcode.com/problems/simplify-path/submissions/1887584608/
*/
import java.util.Stack;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {
        String str = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(str));
    }

    public static String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for (String cur : arr) {
            if (cur.equals(".") || cur.isEmpty()) {
                continue; 
            }else if (cur.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(cur);
            }
        }
        return stack.stream().map(x -> '/' + x).collect(Collectors.joining());
    }
}
