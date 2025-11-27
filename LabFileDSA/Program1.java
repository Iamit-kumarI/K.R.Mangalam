
import java.util.Scanner;

/*
* Program: Linear Search – Implement linear search to find an element in an array.
* Repo: 
 */
public class Program1{
    public static void main(String[]args){
        int[]arr={3,4,5,6,2,1};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Key To Search: ");
        System.out.println(linearSearch(arr,sc.nextInt()));
    }
    public static boolean linearSearch(int[]arr,int key){
        for(int val:arr)if(val==key)return true;
        return false;
    }
}