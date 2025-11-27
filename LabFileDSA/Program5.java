/*
* Program:Insertion Sort – Insert each element into the sorted portion of the array
* Repo:
*/
import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        int[]arr={3,4,6,3,1,6,5};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>=key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
