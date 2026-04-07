package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_07.unit2.task9;

import java.util.ArrayList;
import java.util.List;

public final class StudentProfile {

    private final int studentId;
    private final String name;
    private final List<String> courses;

    // Constructor
    public StudentProfile(int studentId, String name, List<String> courses) {
        this.studentId = studentId;
        this.name = name;

        this.courses = new ArrayList<>(courses);
    }


    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return studentId + " - " + name + " - " + courses;
    }
}
