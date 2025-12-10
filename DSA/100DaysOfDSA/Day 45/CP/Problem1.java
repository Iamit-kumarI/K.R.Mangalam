/*
* Problem:74. Search a 2D Matrix
* Solution:https://leetcode.com/problems/search-a-2d-matrix/solutions/7404689/java-binary-search-beats-100-by-amitk300-8zcu
*/
public class Problem1 {
    public boolean searchMatrix(int[][] matrix, int target) {
      boolean found=false;
        for(int []row:matrix)if(binarySearech(row,target)){
            found=true;
            break;
        }
        return found;
    }
    public boolean binarySearech(int[]arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target)end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
