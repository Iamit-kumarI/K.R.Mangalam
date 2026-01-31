package Assignments.LabAssignment1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark1=mark(sc);
        int mark2=mark(sc);
        int mark3=mark(sc);
        int avg=(mark2+mark1+mark3)/3;
        if(avg>85) System.out.println(" A Grade");
        else if(avg>75) System.out.println(" B Grade");
        else if(avg>55) System.out.println(" C Grade");
        else if(avg>40) System.out.println(" D Grade");
        else System.out.println(" Fail Try Again");
    }
    public static int mark(Scanner sc){
        System.out.println("Enter Marks: ");
        int n=sc.nextInt();
        if(n<0||n>100){
            System.out.println("Mark Should be between 0 - 100");
            mark(sc);
        }
        return n;
    }
}
