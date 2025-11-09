/*
 * Problem:1. Two Sum
 * Solution:https://leetcode.com/problems/two-sum/solutions/7338063/java-hashmap-beats-100-by-amitk300-fdr2
 */
import java.util.HashMap;

public class Problem2 {
    public int[] twoSum(int[] nums, int target) {
        // lets do in O(n) using hasmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];
            if (map.containsKey(newtarget)) {
                return new int[]{map.get(newtarget), i};
            }
            map.put(nums[i], i);
        }
        //O(n^2)
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)return new int[]{i,j};
        //     }
        // }
        return new int[]{-1, -1};
    }
}
