package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.rules;

public class UGRule extends AcademicRule {
    @Override
    public int calculateCredits() {
        int subjects = 5;
        int credits = 4;
        return subjects * credits;
    }
}
