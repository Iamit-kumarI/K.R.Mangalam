package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(sc.nextInt(),sc.nextInt()));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
