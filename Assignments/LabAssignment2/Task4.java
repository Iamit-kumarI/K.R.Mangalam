package Assignments.LabAssignment2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean[]feesPaid=new boolean[50];
        int index=9;
        while(index-->0)feesPaid[index]=sc.nextBoolean();
        int paid=0,unpaid=0,percentagePaid=0;
        for(int i=0;i<10;i++){
            if(feesPaid[i])paid++;
            else unpaid++;
        }
        System.out.println("Paid : "+paid+"/50\n"+"Unpaid : "+unpaid+"/50\n"+"Paid Percentage: "+(paid*100)/50+"%\n"+(unpaid*100)/50+"%");
    }
}
