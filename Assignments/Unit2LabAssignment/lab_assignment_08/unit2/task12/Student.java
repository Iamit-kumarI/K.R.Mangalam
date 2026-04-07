package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task12;

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

    @Override
    public String toString() {
        return studentId + " - " + name;
    }
}
