/*
* Problem:Rotate Matrix by 180 Degrees
* Solution:https://discuss.geeksforgeeks.org/comment/3506a5ab-3f8a-4f01-ac9c-ee8f066826ca/practice
*/
class Problem1 {
    public void rotateMatrix(int[][] mat) {
        // code here
        int start=0,end=mat.length-1;
        while(start<end){
            int []temp=mat[start];
            mat[start]=mat[end];
            mat[end]=temp;
            rev(mat[start++]);
            rev(mat[end--]);
        }
        if(start==end)rev(mat[start]);
    }
    public int[]rev(int[]arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;
    }
}
