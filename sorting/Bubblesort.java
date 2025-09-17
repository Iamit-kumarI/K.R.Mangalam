
import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        int[]num={4,3,5,2,1};
        int i=0;
        System.out.println(Arrays.toString(Bubsort(num,i,0)));
    }
    static int[]Bubsort(int[]num,int i,int j){
        int len=num.length-1;
        if(i==len){
            return num;
        }
        if(j>=len){
            i+=1;
            j=0;
        }
        //swap
        if(j<len&&num[j]>num[j+1]){
            int temp=num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
        }
        return Bubsort(num, i, j+=1);
    }
}
