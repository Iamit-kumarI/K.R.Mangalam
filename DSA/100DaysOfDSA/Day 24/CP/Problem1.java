/*
*Problem:Binary Search
*Solution:https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
*/
class Problem1 {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int index=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                end=mid-1;
                index=mid;
            }
            if(arr[mid]<k)start=mid+1;
            else end=mid-1;
        }
        return index;
    }
}