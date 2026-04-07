package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task4;

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
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;
        return studentId == s.studentId;
    }
    @Override
    public int hashCode() {
        return studentId;
    }
}