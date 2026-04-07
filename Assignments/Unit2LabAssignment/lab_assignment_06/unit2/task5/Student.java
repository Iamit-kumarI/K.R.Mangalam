package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task5;

public class Student {

    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}
