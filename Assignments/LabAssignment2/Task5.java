package Assignments.LabAssignment2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]marks=new int[5];
        for(int i=0;i<5;i++)marks[i]=sc.nextInt();
        int higest=Integer.MIN_VALUE,lowest=Integer.MAX_VALUE,avg=0,topperIndex=0,index=1;
        for(int val:marks){
            if(val>higest){
                topperIndex=index;
                higest=val;
            }
            if(val<lowest)lowest=val;
            avg+=val;
            index++;
        }
        System.out.println("Higest Mark : "+higest+"\nLowest Mark : "+lowest+"\nAvg : "+avg/5+"\nTopper Index : "+topperIndex);
    }
}
