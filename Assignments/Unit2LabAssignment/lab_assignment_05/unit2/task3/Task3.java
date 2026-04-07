package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task3;

import java.util.HashSet;

public class Task3 {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(101, "Gaurav");
        Student s3 = new Student(102, "Chandan");

        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("Total Students in HashSet: " + set.size());
        for (Student s: set) {
            System.out.println(s.getStudentId() + " " + s.getName());
        }
    }
}
