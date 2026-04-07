package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_08.unit2.task12;

public class Task12 {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student(101, "Puja"));
        service.addStudent(new Student(102, "Amit"));

        service.findById(101)
                .ifPresent(s -> System.out.println("Found: " + s));

        Student s1 = service.findById(999)
                .orElse(new Student(0, "Default Student"));
        System.out.println("Using orElse: " + s1);

        try {
            Student s2 = service.findById(999)
                    .orElseThrow(() -> new RuntimeException("Student not found!"));
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
