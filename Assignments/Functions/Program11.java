package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPalindrom(num));
        isPalin(num+"");
    }
    public static boolean isPalindrom(int n){//return type
        int given=n,newNo=0;
        while(given>0){
            int rem=given%10;
            newNo=(newNo*10)+rem;
            given/=10;
        }
        return n==newNo;
    }
    public static void isPalin(String n){//no return type
        System.out.println(n.equals(new StringBuilder(n).reverse().toString()));
    }
}
