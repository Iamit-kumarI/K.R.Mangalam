/*
* Problem: Selection Sort – Find the minimum element and place it in the correct position.
* Repo: 
*/

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[]arr={3,4,6,3,1,6,5};
        System.out.println("Selection Sort: "+Arrays.toString(selectionSort(arr)));
    }
    public static int[] selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }
}
