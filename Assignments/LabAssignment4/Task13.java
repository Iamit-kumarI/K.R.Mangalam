package Leetcode.Assignments.LabAssignment4;

public class Task13 {
    public static void main(String[] args) {
        try{
//            Student student=new Student("Amit", 2, "MCA", 102,
//                    new int[]{78, 78, 78, 78, 100});//mark Exception
            Student student=new Student("Amit", 18, "MCA", 102,
                    new int[]{78, 78, 78, 78, 101});
            student.displayProfile();
            student.getMarks(6);
        }catch (Exception e){
            System.out.println("Exception In Creating Object "+e);
        }finally {
            System.out.println("I am finally block");
        }
    }
}
