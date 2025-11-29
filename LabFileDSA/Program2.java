import java.util.Scanner;

/*
* Problem:Binary Search (Iterative) – Search for a key in a sorted array using binary search.
* Repo: 
*/
public class Program2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key: ");
        System.out.println(binarySearch(arr,sc.nextInt()));
    }
    public static boolean binarySearch(int []arr,int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key)return true;
            else if(arr[mid]<key)end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
