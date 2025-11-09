/*
 * CP sheet was shared with mca students on 28 oct 2025 so acc to that today is
 * day 14 few students updating tracker sheet faster i have notices there is some updation 
 * of even day 16 specially Aman and Ram Kumar Singh
 * Problem:3005. Count Elements With Maximum Frequency
 * Solution:https://leetcode.com/problems/count-elements-with-maximum-frequency/solutions/7337972/java-hashmap-beats-100-by-amitk300-i0qz
 */
public class Problem1 {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        for (int val : nums) {
            if (val > max) {
                max = val;
            }
        }
        int[] freq = new int[max + 1];
        for (int val : nums) {
            freq[val]++;
        }
        int maxfreq = 0;
        for (int val : nums) {
            if (freq[val] > maxfreq) {
                maxfreq = freq[val];
            }
        }
        int ans = 0;
        // 1,1,2,2 totall is 4 but getting 8 need to count only once
        // for(int val:nums)if(freq[val]==maxfreq)ans+=maxfreq;
        boolean[] seen = new boolean[max + 1];
        for (int val : nums) {
            if (!seen[val] && freq[val] == maxfreq) {
                ans += maxfreq;
                seen[val] = true;
            }
        }
        return ans;
    }
}
// Approach Two Which is explained in the solution
// class Solution {

//     public int maxFrequencyElements(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int val : nums) {
//             map.put(val, map.getOrDefault(val, 0) + 1);
//         }
//         int maxfreq = 0, trackdub = 0;
//         for (int freq : map.values()) {
//             if (freq > maxfreq) {
//                 maxfreq = freq;
//                 trackdub = freq;
//             } else if (freq == maxfreq) {
//                 trackdub += maxfreq;
//             }
//         }
//         return trackdub;
//     }
// }
