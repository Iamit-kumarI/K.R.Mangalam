/*
 * Problem:169. Majority Element
 * Solution: https://leetcode.com/problems/majority-element/submissions/1819208098/
 */
import java.util.*;
public class Problem1{
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int freq = 0, ans = -1;
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
            if (map.get(val) > freq) {
                freq = map.get(val);
                ans = val;
            }
        }
        return ans;
    }
}
