package Leetcode.Assignments.Functions;

import java.util.Scanner;

public class Program2 {//class Subtrack
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(subtrack(sc.nextInt(),sc.nextInt()));
    }
    public static int subtrack(int a, int b){
        return a-b;
    }
}