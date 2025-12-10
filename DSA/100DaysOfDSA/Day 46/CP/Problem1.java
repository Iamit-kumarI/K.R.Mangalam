/*
* Problem:Sorted matrix
* Solution:https://www.geeksforgeeks.org/problems/sorted-matrix2333/1(explanation ll write soon)
*/
public class Problem1{
     int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        // exams are coming so for the time being i have used extrs space
        //but later will do this without using extra space
        int[]arr=new int[N*N];
        int index=0;
        for(int []row:Mat)for(int val:row)arr[index++]=val;
        index=0;
        Arrays.sort(arr);
        int[][]sortedArr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sortedArr[i][j]=arr[index++];
            }
        }
        return sortedArr;
    }
}