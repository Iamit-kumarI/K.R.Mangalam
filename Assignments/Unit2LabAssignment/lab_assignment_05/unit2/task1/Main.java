package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task1;

abstract class AcademicRule {

    protected int marks;

    public AcademicRule(int marks) {
        this.marks = marks;
    }

    abstract int calculateCredits();
}

class UGRule extends AcademicRule {

    public UGRule(int marks) {
        super(marks);
    }

    @Override
    int calculateCredits() {
        if (marks >= 80) return 4;
        else if (marks >= 60) return 3;
        else if (marks >= 40) return 2;
        else return 0;
    }
}

class PGRule extends AcademicRule {

    public PGRule(int marks) {
        super(marks);
    }

    @Override
    int calculateCredits() {
        if (marks >= 85) return 5;
        else if (marks >= 70) return 4;
        else if (marks >= 50) return 3;
        else return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        AcademicRule rule;

        rule = new UGRule(75);
        System.out.println("UG Credits: " + rule.calculateCredits());

        rule = new PGRule(75);
        System.out.println("PG Credits: " + rule.calculateCredits());
    }
}