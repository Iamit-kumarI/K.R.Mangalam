package Assignments.LabAssignment1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.next();
        System.out.print("Enter Age: ");
        int age=age(sc);
        System.out.print("Enter Program: ");
        String program=program(sc);
        System.out.print("Enter Registration NO: ");
        String registrationNumber=regNo(sc);
        System.out.println("Name : "+name+"\n "+"Age : "+age+"\n"+"Program : "+program+"\n"+"Registration Number: "+registrationNumber);
    }
    public static String program(Scanner sc){
        String name=sc.next();
        if(name.equals("MCA")||name.equals("BCA")||name.equals("MBA")) return name;
        System.out.println("Program Avalible MCA/BCA/MBA");
        return program(sc);
    }
    public static int age(Scanner sc){
        int age=sc.nextInt();
        if(age>=17)return age;
        System.out.println("Age should be 17 or more than 17");
        return age(sc);
    }
    public static String regNo(Scanner sc){
        String str=sc.next();
        if(!str.isEmpty())return str;
        System.out.println("Registration No shouldn't be Empty");
        return regNo(sc);
    }
}
