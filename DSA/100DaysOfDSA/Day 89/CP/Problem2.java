
import java.util.Stack;

/*
* Problem:Next Greater Element Circular
* Solution:https://leetcode.com/problems/next-greater-element-ii/submissions/1893480299/
*/
class Problem2 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int cur = i % n;
//            if(!stack.isEmpty()){
            while (!stack.isEmpty() && nums[stack.peek()] < nums[cur]) {
                ans[stack.pop()] = nums[cur];
            }
//            }
            if (i < n) {
                stack.push(cur);
            }
        }
        return ans;
    }
}
