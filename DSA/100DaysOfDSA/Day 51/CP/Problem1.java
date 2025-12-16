/*
* Problem:Print Matrix Anti-diagonals
* Solution:https://www.geeksforgeeks.org/problems/print-diagonally1623/1
*/
// User function Template for Java

class Problem1 {
    public int[] antiDiagonalPattern(int[][] matrix) {
        // Code here
        int index=0,n=matrix.length,m=matrix[0].length;
        int[]arr=new int[n*m];
        for(int i=0;i<n-1+m;i++){
            for(int j=0;j<n;j++){
                int t=i-j;
                if(t>=0&&t<m)arr[index++]=matrix[j][t];
            }
        }
        return arr;
    }
}