package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program10 {//Remender Class

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        remender(sc.nextInt(),sc.nextInt());
    }
    public static void remender(int a,int b){
        System.out.println(a%b);
    }
}
