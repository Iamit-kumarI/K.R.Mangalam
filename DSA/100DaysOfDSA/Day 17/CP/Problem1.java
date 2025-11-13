/*
 * Problem:Insertion Sorts
 * Solution:https://www.geeksforgeeks.org/problems/insertion-sort/1
 */
public class Problem1 {
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int cur=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>cur){
                //swap
                arr[j+1]=arr[j--];
            }
            arr[j+1]=cur;
        }
    }
}