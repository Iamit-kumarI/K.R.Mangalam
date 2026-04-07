package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.rules;

public class PGRule extends AcademicRule {
    @Override
    public int calculateCredits() {
        int subjects = 4;
        int credits = 5;
        return subjects * credits;
    }
}
