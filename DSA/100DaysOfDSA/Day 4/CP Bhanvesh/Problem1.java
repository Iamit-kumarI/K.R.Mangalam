// package CP Bhanvesh;
/*
 * Problem: 3005. Count Elements With Maximum Frequency
 * Solution: https://leetcode.com/problems/count-elements-with-maximum-frequency/
 */
import java.util.HashMap;

public class Problem1 {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums)map.put(val,map.getOrDefault(val,0)+1);
        int maxfreq=0,trackdub=0;
        for(int freq:map.values()){
            if(freq>maxfreq){
                maxfreq=freq;
                trackdub=freq;
            }
            else if(freq==maxfreq){
                trackdub+=maxfreq;
            }
        }
        return trackdub;
    }
}
