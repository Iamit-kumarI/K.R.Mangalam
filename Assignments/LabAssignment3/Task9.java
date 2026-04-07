package Leetcode.Assignments.LabAssignment3;

import java.util.Random;

public class Task9 {
    static class Student{
        String name;
        int age;
        String program;
        int year;
        long rollNo;

        public String getName() {
            return this.name;
        }

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
            return year;
        }
        public void setYear(int year){
            if(year<0||year>4){
                System.out.println("Valid year are 0 - 4");
                System.out.println("Try Again");
            }
            this.age=age;
        }
        public Student(String name,int age,String program,int year){
            this.name=name;
            setAge(age);
            this.program=program;
            this.year=year;
            this.rollNo=new Random().nextInt(9000)*10000;
        }
        public void printProfile(){
            System.out.println("\n--- Student Summary ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Year: "+ year);
            System.out.println("Roll No : "+rollNo+" *auto generate");

        }
        public long getRollNO(){
            return this.rollNo;
        }
    }

    public static void main(String[] args) {
        Student student1=new Student("Amit",22,"MCA",3);
        System.out.println("Summary Of Sudent "+student1.getName());
        student1.printProfile();
        Student student2=new Student("Puja",21,"MCA",2);
        student2.printProfile();

    }
}
