/*
* Problem:Set Matrix Zeroes
* Solution:https://leetcode.com/problems/set-matrix-zeroes/solutions/7407892/java-matrix-1d-beats-100-by-amitk300-4z4y
*/
public class Problem2 {
    public void setZeroes(int[][] matrix) {
      boolean[]row=new boolean[matrix.length];
        boolean[]col=new boolean[matrix[0].length];
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
