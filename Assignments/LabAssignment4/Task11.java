package Leetcode.Assignments.LabAssignment4;

import Leetcode.Assignments.LabAssignment4.ScholarStudent;

public class Task11 {
    public static void main(String[] args) {
        ScholarStudent student=new ScholarStudent("Amit", 22, "MCA", 1560016,
                new int[]{78, 78, 78, 78, 78},
                10000);
        System.out.println("____________________________ With ScholarShip____________________________");
        student.displayProfile();
        System.out.println("\n\n________________________________Without ScholarShip_____________________________");
        Student student1=new Student("Amit", 22, "MCA", 1560016,
                new int[]{78, 78, 78, 78, 78});
        student1.displayProfile();
    }
}
