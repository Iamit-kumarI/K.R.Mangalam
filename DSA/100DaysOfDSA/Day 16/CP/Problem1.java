/*
 * Problem:33. Search in Rotated Sorted Array
 * Solution: https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/7342298/java-recursion-beats-100-by-zerogrind-tm4z
 */
public class Problem1 {
    public int search(int[] nums, int target) {
        return rotatedSearch(nums,target,0,nums.length-1);            
    }
    public int rotatedSearch(int []nums,int target, int start,int end){
        if(start>end)return -1;
        int mid=start+(end-start)/2;
        if(nums[mid]==target)return mid;
        if(nums[start]<=nums[mid]){               
            if(target>=nums[start]&&target<=nums[mid]){
                return rotatedSearch(nums,target,start,mid-1);
            }else{
                return rotatedSearch(nums,target,mid+1,end);
            }                    
        }
        if(target>=nums[mid]&&target<=nums[end]){
            return rotatedSearch(nums,target,mid+1,end);
        }
        return rotatedSearch(nums,target,start,mid-1);
    }
}
