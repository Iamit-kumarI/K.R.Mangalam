package Leetcode.Assignments.LabAssignment4;

public class Task10 {
    public static void main(String[] args) {
        ScholarStudent student1=new ScholarStudent("Amit", 22, "MCA", 102,
        new int[]{78, 78, 78, 78, 78},
                10000.89);
        student1.displayProfile();
        ScholarStudent student2=new ScholarStudent("Puja", 21, "MCA", 108,
                new int[]{78, 67, 78, 89, 78},
                10000.89);
        student2.displayProfile();
        ScholarStudent student3=new ScholarStudent("Satyam", 25, "B-tech", 105,
                new int[]{48, 78, 89, 78, 73},
                10000.89);
        student3.displayProfile();
    }
}
