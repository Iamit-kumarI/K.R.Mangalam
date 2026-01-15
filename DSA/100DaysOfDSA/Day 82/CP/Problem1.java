import java.util.Stack;
/*
* Problem:Remove Adjacent Duplicates using Stack
* Solution:https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/1885445492/
*/
public class Problem1 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); 
            }else {
                stack.push(c);
            }
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
