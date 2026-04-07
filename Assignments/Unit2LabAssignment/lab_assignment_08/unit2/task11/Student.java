package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task11;

public class Student {
    private int studentId;
    private String name;
    private int marks;
    private String program;
    public Student(int studentId, String name, int marks, String program) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        this.program = program;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public String getProgram() {
        return program;
    }
}
