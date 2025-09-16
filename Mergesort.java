
import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int []arr={3,5,4,7,6,8,9};
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[]mergesort(int []arr){
        //return arr when length reaches to 1
        if(arr.length==1){
            return arr;
        }

        //finding the mid to devide the array into the partes eachtime function mergesort called
        int mid=arr.length/2;

        //making copy of left side with the help of mid index
        int[]left=mergesort(Arrays.copyOfRange(arr, 0, mid));

        //making copy of right side with the help of mid index
        int[]right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        //passing the copy of array once it return the array while length was one
        return mix(left,right);
    }
    static int[]mix(int[]left,int []right){

        //mixarr the final array will be legth eqqual size of both left and right
        int[]mixarr=new int[left.length+right.length];

        /*take the three variables 
        i=an index to keep track of left side array
        j=an index to keep track of right side array
        k=an index to keep track index where we reached in the in the mixarr the element stored*/
        int i=0,j=0,k=0;
        
        //when none array is finished like we are storing the element in the array by comparing from both array
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mixarr[k]=left[i];
                i++;
            }else{
                mixarr[k] = right[j];
                j++;
            }
            k++;
        } 
        //if any array gets empty
        while(i<left.length){
            mixarr[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length) { 
            mixarr[k] = right[j];
            j++;
            k++;
        }
        return mixarr;
    }
}
