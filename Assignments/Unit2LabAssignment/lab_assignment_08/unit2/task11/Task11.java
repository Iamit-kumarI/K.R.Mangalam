package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task11;

import java.util.*;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Simran", 85, "BCA"));
        students.add(new Student(102, "Amit", 92, "MCA"));
        students.add(new Student(103, "Suraj", 75, "BCA"));
        students.add(new Student(104, "Karan", 88, "MBA"));
        students.add(new Student(105, "Puja", 95, "MCA"));

        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Student Names:");
        System.out.println(names);
// Count students by program
        Map<String, Long> programCount = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getProgram, Collectors.counting()
                ));
        System.out.println("\nStudents Count by Program:");
        System.out.println(programCount);
// Find top scorer using max()
        Optional<Student> topScorer = students.stream()
                .max(Comparator.comparing(Student::getMarks));
        System.out.println("\nTop Scorer:");
        topScorer.ifPresent(s ->
                System.out.println(s.getName() + " " + s.getMarks())
        );
// Filter students with marks > 80
        List<Student> filtered = students.stream()
                .filter(s -> s.getMarks() > 80)
                .collect(Collectors.toList());
        System.out.println("\nStudents with Marks > 80:");
        filtered.forEach(s ->
                System.out.println(s.getName() + " " + s.getMarks())
        );
    }
}