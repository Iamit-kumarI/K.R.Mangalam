/*
* Problem:Binary Search
* Solution:https://discuss.geeksforgeeks.org/comment/4827b6be-2d22-4838-b753-80a37d36d8d3/practice
*/
public class Program1 {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        return binarySearch(arr,k,0,arr.length-1,-1);
    }
    public int binarySearch(int[]arr,int target,int start,int end,int ans){
        if(start>end)return ans;
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            ans= mid;
            return binarySearch(arr,target,start,mid-1,ans);
        }
        if(arr[mid]>target)return binarySearch(arr,target,start,mid-1,ans);
        return binarySearch(arr,target,mid+1,end,ans);
        
    }
}