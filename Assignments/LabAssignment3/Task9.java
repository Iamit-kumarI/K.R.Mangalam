package Assignments.LabAssignment3;

import java.util.Random;

public class Task9 {
    static class Student{
        int age;
        String program;
        char year;
        long rollNo;
        public int getAge() {
            return this.age;
        }
        public void setAge(int age){
            if(age<=17){
                System.out.println("Invlid age, Age should be able 17");
                System.out.println("Try again");
                return;
            }
            this.age=age;
        }
        public int getYear() {
            return this.year;
        }
        public void setYear(char year){
            if(year<'0'||year>'4'){
                System.out.println("Valid year are 0 - 4");
                System.out.println("Try Again");
            }
            this.age=age;
        }
        public Student(int age,String program,char year){
            setAge(age);
            this.program=program;
            setYear(year);
            this.rollNo=new Random().nextInt(9000)*10000;
        }
        public long getRollNO(){
            return this.rollNo;
        }
    }

    public static void main(String[] args) {
        Student student=new Student(22,"MCA",'3');
        System.out.println(student.getRollNO());
    }
}
