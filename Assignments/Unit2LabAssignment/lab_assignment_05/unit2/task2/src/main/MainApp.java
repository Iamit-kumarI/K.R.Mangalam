package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.main;
import Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.model.Student;
import Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.rules.PGRule;
import Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.rules.UGRule;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(251, "Amit", 22, "MCA");
        s.display();
        UGRule  u1 = new UGRule();
        System.out.println("UG Credits: " + u1.calculateCredits());
        PGRule u2 = new PGRule();
        System.out.println("PG Credits: " + u2.calculateCredits());
    }

}
