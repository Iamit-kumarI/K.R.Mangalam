package Assignments.LabAssignment3;

public class Task7 {
//    @AllArgsConstructor
//    @NoArgsContructor
    static class Student{
        String name;
        int age;
        String program;
        long rollNo;
        int[]marks=new int[5];
        public Student(){

        }
        public Student(String name,int age,String program,long rollNo,int[]arr){
            this.name=name;
            this.age=age;
            this.program=program;
            this.rollNo=rollNo;
            this.marks=arr;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getAge() {
           return this.age;
        }
        public void setAge(int age){
            this.age=age;
        }
        public String getProgram(){
            return this.program;
        }
        public void setProgram(String program){
            this.program=program;
        }
        public int getMarks(int subject){
            return marks[subject];
        }
        public void setMarks(int mark,int subject){
            this.marks[subject]=mark;
        }
    }
    public static void main(String[] args) {
//        Student student=new Student();
        Student student1=new Student("Amit",22,"MCA",2501560016L,new int[]{78,78,78,78,78});
        displayProfile(student1);
        System.out.println(avg(student1));
        assignGrade(student1);
        System.out.println(student1.getAge());
        student1.setMarks(79,3);
        System.out.println(student1.getMarks(3));
    }
    public static void displayProfile(Student student){
        System.out.println("Name : "+student.name+"\n"+"Age : "+student.age+"\n"+"Program : "+student.program+"\n"+"Roll No: "+student.rollNo);
        int avg=0;
        for(int val:student.marks)avg+=val;
        System.out.println("Avg : "+avg/student.marks.length);
    }
    public static int avg(Student student){
        int avg=0;
        for(int val:student.marks)avg+=val;
        return (int)avg/student.marks.length;
    }
    public static void assignGrade(Student student){
        int avg=avg(student);
        if(avg>85) System.out.println(" A Grade");
        else if(avg>75) System.out.println(" B Grade");
        else if(avg>55) System.out.println(" C Grade");
        else if(avg>40) System.out.println(" D Grade");
        else System.out.println(" Fail Try Again");
    }
}
