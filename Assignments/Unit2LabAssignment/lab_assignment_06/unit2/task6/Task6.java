package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task6;

import Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task6.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Amit"));
        students.add(new Student(102, "Puja"));
        students.add(new Student(103, "Simran"));

        try {
            for (Student s : students) {
                if (s.getStudentId() == 102) {
                    students.remove(s); // causes ConcurrentModificationException
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getStudentId() == 103) {
                iterator.remove(); // safe removal
            }
        }

        System.out.println("\nRemaining Students:");
        for (Student s : students) {
            System.out.println(s.getStudentId() + " " + s.getName());
        }
    }
}
