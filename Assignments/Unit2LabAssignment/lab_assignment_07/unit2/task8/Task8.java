package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_07.unit2.task8;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Puja", 85, "BTech"));
        list.add(new Student(102, "Amit", 75, "MCA"));
        list.add(new Student(103, "Neha", 90, "BTech"));

        list.sort((s1, s2) -> s1.getMarks() - s2.getMarks());

        System.out.println("Sorted by Marks (Traditional Comparator): ");
        list.forEach(System.out::println);

        list.sort((s1, s2) -> s1.getProgram().compareTo(s2.getProgram()));

        System.out.println("\nSorted by Program(Lambda Comparator): ");
        list.forEach(System.out::println);
        System.out.println("\nComparison:");
        System.out.println("Traditional Comparator: More code, less readable");
        System.out.println("Lambda Comparator: Less code, more readable");
    }
}
