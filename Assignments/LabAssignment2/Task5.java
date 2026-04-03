package Assignments.LabAssignment2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]marks=new int[5];
        int higest=Integer.MIN_VALUE,lowest=Integer.MAX_VALUE,sum=0,topperIndex=0;
        for(int i=0;i<5;i++){
            System.out.print("Enter Marks For Student "+(i+1)+" : ");
            marks[i]=sc.nextInt();
            if(marks[i]>higest){
                higest=marks[i];
                topperIndex=i;
            }
            if(marks[i]<lowest)lowest=marks[i];
            sum+=marks[i];
        }
        System.out.println("======= Result =========");
        System.out.println("Higest Mark : "+higest+"\nLowest Mark : "+lowest+"\nAvg : "+sum/5+"\nTopper Index : "+topperIndex);
    }
}
