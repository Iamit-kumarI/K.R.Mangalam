package Leetcode.Assignments.LabAssignment2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("MCA2025_STU_");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No OF Students :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) System.out.println(sb.toString()+(i+1));
    }
}
