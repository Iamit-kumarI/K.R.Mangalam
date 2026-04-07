package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task4;

import java.util.ArrayList;
import java.util.HashSet;
public class Course {
    private String courseName;

    private static ArrayList<Course> courses = new ArrayList<>();

    private HashSet<Student> students = new HashSet<>();
    public Course(String courseName) {
        this.courseName = courseName;
        courses.add(this);
    }
    public void enrollStudent(Student s){
        students.add(s);
    }
    public void printStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(s.getStudentId() + " " + s.getName());
        }
        System.out.println("Total Students: " + students.size());
    }
    public static void printCourses() {
        System.out.println("Courses Available:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}