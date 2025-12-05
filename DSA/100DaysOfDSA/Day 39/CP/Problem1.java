/*
* Problem: 724. Find Pivot Index
* Solution: https://leetcode.com/problems/find-pivot-index/solutions/7391939/java-beats-100-two-pointer-recursion-by-o5rak
*/
public class Problem1 {
    public int pivotIndex(int[] nums) {
        return helper(nums,sum(nums,0),0,0);
    }
    public int helper(int []arr,int totalSum,int index,int leftSum){
        if(index==arr.length)return -1;
        if(leftSum==totalSum-leftSum-arr[index])return index;
        return helper(arr,totalSum,index+1,leftSum+arr[index]);
    }
    public int sum(int[]arr,int index){
        if(index==arr.length-1)return arr[index];
        return arr[index]+sum(arr,index+1);
    }
}