/*
 * Problem:349. Intersection of Two Arrays
 * Solution:https://leetcode.com/problems/intersection-of-two-arrays/solutions/7358515/java-arraylist-beats-100-by-zerogrind-dldr
 */
import java.util.ArrayList;
class Problem1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            if(search(nums1[i],nums2)){
                if(!list.contains(nums1[i]))list.add(nums1[i]);
            }
        }
        // Set<Integer> set1=new HashSet<>();
        // Set<Integer> set2=new HashSet<>();
        // for(int val:nums1)set1.add(val);
        // for(int val:nums2)set2.add(val);
        // ArrayList<Integer> list=new ArrayList<>();
        // if(set1.size()>set2.size()){
        //     for(int val:set2)if(set1.contains(val))list.add(val);
        // }else{
        //     for(int val:set1)if(set2.contains(val))list.add(val);
        // }
        int []arr=new int[list.size()];
        int index=0;
        for(int val:list){
            arr[index++]=val;
        }
        return arr;
    }
    public boolean search(int target,int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return true;
        }
        return false;
    }
}