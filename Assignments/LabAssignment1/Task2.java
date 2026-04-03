package Leetcode.Assignments.LabAssignment1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Program (MCA/BCA/MBA): ");  String program = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        String regNo = sc.nextLine();
        if (age < 17) {
            System.out.println("Invalid Age! Must be 17 or above.");  return;
        }
        if (regNo.isEmpty()) {
            System.out.println("Registration number cannot be empty.");  return;
        }
        boolean validProgram = true;
        switch (program.toUpperCase()) {
            case "MCA":
            case "BCA":
            case "MBA":
                break;
            default:
                validProgram = false;
        }
        if (!validProgram) {
            System.out.println("Invalid Program! Must be MCA, BCA, or MBA.");  return;
        }
        System.out.println("\n+---------------------------------------+");
        System.out.println("| STUDENT ID CARD                 |");  System.out.println("+---------------------------------------+");
        System.out.printf("| Name : %-20s      |\n", name);
        System.out.printf("| Age : %-20d         |\n", age);
        System.out.printf("| Program : %-20s    |\n", program.toUpperCase());
        System.out.printf("| Reg Number :%-20s|\n", regNo);
        System.out.println("+---------------------------------------+");
        System.out.println("| Status : VALID STUDENT |");
        System.out.println("+---------------------------------------+");
    }
}
