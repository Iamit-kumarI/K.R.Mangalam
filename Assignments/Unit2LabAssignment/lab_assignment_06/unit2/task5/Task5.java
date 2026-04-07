package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_06.unit2.task5;

public class Task5 {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student(101, "Amit"));
        service.addStudent(new Student(102, "Puja"));

        service.getStudentById(101);

        service.getStudentById(999);
    }
}
