import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Problem:Smaller Element on Left
* Solution:https://leetcode.com/problems/count-of-smaller-numbers-after-self/submissions/1882543155/
*/
public class Problem2 {
    private int[] bit;
    private int n;

    private int query(int index) {
        int sum = 0;
        for (; index > 0; index -= (index & (-index))) {
            sum += bit[index];
        }
        return sum;
    }

    private void update(int index, int val) {
        for (; index <= n; index += (index & (-index))) {
            bit[index] += val;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        this.n = nums.length;
        this.bit = new int[n + 1];

        int[][] numsIdx = new int[n][2];
        for (int i = 0; i < n; i += 1) {
            numsIdx[i][0] = nums[i];
            numsIdx[i][1] = i;
        }

        Arrays.sort(numsIdx, (a, b) -> a[0] - b[0]);
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            count.add(0);
        }

        for (int[] data : numsIdx) {
            int val = data[0], key = data[1];
            update(key + 1, 1);
            count.set(key, query(n) - query(key + 1));
        }
        return count;
    }
}
    /*
    // not working for all cases
    public static List<Integer> countSmaller(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        Collections.addAll(stack, Arrays.stream(nums).boxed().toArray(Integer[]::new));
        List<Integer>list=new ArrayList<>();
        int index=0;
        list.add(0);
        while(!stack.isEmpty()){
            int peek=stack.peek();
            stack.pop();
            int pop=stack.peek();
            if(pop>=peek)list.add(list.get(index++));
            else {
                list.add(list.get(index++)+1);
            }
        }
        return list.reversed();
    }
    */
