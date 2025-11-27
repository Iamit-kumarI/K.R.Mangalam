
import java.util.Arrays;

/*
* Problem:
* Repo: 
 */
public class Program3 {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,4,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[]bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
