package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program5 {//Remainder class

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(remender(sc.nextInt(),sc.nextInt()));
    }
    public static int remender(int a, int b){
        return a%b;
    }
}