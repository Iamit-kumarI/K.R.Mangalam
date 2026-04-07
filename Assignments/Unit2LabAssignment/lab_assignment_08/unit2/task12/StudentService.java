package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task12;

import java.util.*;

public class StudentService {

    private List<Student> list = new ArrayList<>();

    public void addStudent(Student s) {
        list.add(s);
    }

    // 🔹 Return Optional instead of null
    public Optional<Student> findById(int id) {
        return list.stream()
                .filter(s -> s.getStudentId() == id)
                .findFirst();
    }
}
