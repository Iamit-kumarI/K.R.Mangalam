package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_07.unit2.task7;

public class Student implements Comparable<Student> {

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}
