package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {//multiply class
        Scanner sc=new Scanner(System.in);
        System.out.println(mulitply(sc.nextInt(),sc.nextInt()));
    }
    public static int mulitply(int a, int b){
        return a*b;
    }
}