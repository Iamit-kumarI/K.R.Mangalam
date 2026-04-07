package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_07.unit2.task7;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Puja"));
        list.add(new Student(102, "Amit"));
        list.add(new Student(103, "Robin"));

        Collections.sort(list);
        System.out.println("Students sorted by name : ");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}