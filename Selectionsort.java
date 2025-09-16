
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int []arr={3,4,5,2,1,7,6};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[]sort(int[]arr){
        return helper(arr,arr.length,0,0);
    }
    static int[]helper(int[]arr,int i,int j,int maxindex){
        if(i==0){
            return arr;
        }
       
        if(j<i){
            if (arr[j] > arr[maxindex]) {
                // maxindex=j;
                return helper(arr, i, j+1, j);
            } else {
                return helper(arr, i, j+1, maxindex);
            }
        }else{
            int temp=arr[maxindex];
            arr[maxindex]=arr[i-1];
            arr[i-1]=temp;
        }
        return helper(arr,i-1,0,0);
    }
}
