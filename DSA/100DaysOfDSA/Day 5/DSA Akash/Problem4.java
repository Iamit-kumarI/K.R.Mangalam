/*
 * Problem:26. Remove Duplicates from Sorted Array
 * Solution:https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Problem4 {

        public int removeDuplicates(int[] nums) {
            // Set<Integer> set=new HashSet<>();
            // for(int val:nums){
            //     set.add(val);
            // }  
            // int i=0;
            // for(int val:set){
            //     nums[i++]=val;
            // }
            // return set.size();
            if (nums.length == 0) {
                return 0;
            }
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    nums[++i] = nums[j];
                }
            }
            return i + 1;
        }
}