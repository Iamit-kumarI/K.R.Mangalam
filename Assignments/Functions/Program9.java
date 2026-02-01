package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        divide(sc.nextFloat(),sc.nextFloat(),sc);
    }
    public static void divide(float a,float b,Scanner sc){
        if(b==0){
            System.out.println("can't divide by 0");
            b=sc.nextFloat();
        }
        System.out.println(a/b);
    }
}
