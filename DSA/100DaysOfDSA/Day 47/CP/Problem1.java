/*
* Problem:Rotate Matrix by 90 Degrees (in-place)
* Solution:https://leetcode.com/problems/rotate-image/solutions/7407879/java-set-math-beats-100-by-amitk300-sgg6
*/
class Problem1 {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRow(matrix);
    }
    public void transpose(int[][]arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public void reverseRow(int[][]arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int start=0,end=len-1;
            while(start<end){
                int temp=arr[i][start];
                arr[i][start++]=arr[i][end];
                arr[i][end--]=temp;
            }
        }
    }
}
