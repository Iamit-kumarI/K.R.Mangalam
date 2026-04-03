package Leetcode.Assignments.LabAssignment2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean[]feesPaid=new boolean[50];
        int index=10;
        int paid=0,unpaid=0,percentagePaid=0;
        while(index-->0){
            System.out.print("Have Student  "+(index+1)+" Paid ? : ");
            feesPaid[index]=sc.nextBoolean();
            if(feesPaid[index])paid++;
            else unpaid++;
        }
        System.out.println("======== Class Report ========");
        System.out.println("Total Students: "+ 10);
        System.out.println("Paid : "+paid+"\n"+"Unpaid : "+unpaid+"\n"+"Paid Percentage: "+(paid*100)/10+"%\n");
    }
}
