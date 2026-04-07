package Leetcode.Assignments.LabAssignment3;

public class Task8 {
    public static void main(String[] args) {
        Student student1=new Student("Amit", 22, new int[]{78, 82, 80, 76, 79});
        student1.printSummary();
        student1.updateMarks(0,89);
        student1.printSummary();
    }
}
