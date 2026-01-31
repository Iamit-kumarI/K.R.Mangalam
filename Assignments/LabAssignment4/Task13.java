package Assignments.LabAssignment4;

public class Task13 {
    public static void main(String[] args) {
        try{
//            Student student1=new Student("Amit", 22, "MCA", 1560016,
//                    new int[]{}); //trying diving by len 0 to create exception manually
//            student1.displayProfile();
//            Student student=new Student("Amit", 2, "MCA", 102,
//                    new int[]{78, 78, 78, 78, 78});//age exception
//            student.displayProfile();
//            Student student=new Student("Amit", 2, "MCA", 102,
//                    new int[]{78, 78, 78, 78, 78,78});//subject(index)
//            student.displayProfile();
            Student student=new Student("Amit", 2, "MCA", 102,
                    new int[]{78, 78, 78, 78, 101});//mark Exception
            student.displayProfile();
        }catch (Exception e){
            System.out.println("Exception In Creating Object "+e);
        }finally {
            System.out.println("I am finally block");
        }
    }
}
