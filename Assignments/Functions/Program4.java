package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program4 {//Divison Class
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(divide(sc.nextFloat(),sc.nextFloat(),sc));
    }
    public static float divide(float a, float b,Scanner sc){
        if(b==0){
            System.out.println("Can't Divide by 0");
            b=sc.nextFloat();
        }
        return a/b;
    }
}