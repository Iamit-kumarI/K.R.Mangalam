package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task10;

import java.util.ArrayList;
import java.util.List;
public class Task10 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Puja", 85));
        students.add(new Student(102, "Amit", 60));
        students.add(new Student(103, "Neha", 75));
        students.add(new Student(104, "Kmika", 65));

        System.out.println("Students with marks > 70 (Traditional Loop):");
        for (Student s : students) {
            if (s.getMarks() > 70) {
                System.out.println(s.getName() + " " + s.getMarks());
            }
        }
        System.out.println("\nStudents with marks > 70 (Lambda Expression):");
        students.stream()
                .filter(s -> s.getMarks() > 70)
                .forEach(s ->
                        System.out.println(s.getName() + " " + s.getMarks())
                );

        System.out.println("\nComparison:");
        System.out.println("Traditional Loop: More code, less readable");
        System.out.println("Lambda Expression: Less code, more readable");
    }
}

