package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task5;
import java.util.HashMap;

public class StudentService {

    private HashMap<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public void getStudentById(int id) {
        Student student = studentMap.get(id);

        if (student != null) {
            System.out.println("Found: " + student);
        } else {
            System.out.println("Student with ID " + id + " not found!");
        }
    }
}
