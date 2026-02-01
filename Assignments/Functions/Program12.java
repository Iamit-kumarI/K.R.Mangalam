package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program12 {//Check2 class
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isniven(num));
        checkNiven(num);
    }
    public static boolean isniven(int n){
        int given=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return given%sum==0;
    }
    public static void checkNiven(int n){
        int given=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(given%sum==0);
    }
}
