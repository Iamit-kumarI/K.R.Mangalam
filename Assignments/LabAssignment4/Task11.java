package Assignments.LabAssignment4;

public class Task11 {
    public static void main(String[] args) {
        ScholarStudent student=new ScholarStudent("Amit", 22, "MCA", 1560016,
                new int[]{78, 78, 78, 78, 78},
                10000);
        System.out.println("_________________________________ With ScholarShip_________________________________");
        student.displayProfile();
        System.out.println("\n\n\n______________________________________Without ScholarShip__________________________________");
        Student student1=new Student("Amit", 22, "MCA", 1560016,
                new int[]{78, 78, 78, 78, 78});
        student1.displayProfile();
    }
}
