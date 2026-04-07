package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task4;

public class Task4 {
    public static void main(String[] args) {
        Course c1 = new Course("Java");
        Course c2 = new Course("JavaScript");
        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(102, "Chandan");
        Student s3 = new Student(101, "Gaurav");
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);
        Course.printCourses();
        c1.printStudents();
    }
}