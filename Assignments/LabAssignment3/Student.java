package Leetcode.Assignments.LabAssignment3;

public class Student{
    String name;
    int age;
    int[]marks;
    Student(String name,int age,int[]marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void updateMarks(int index,int marks){
        if(index>=0&&index<5){
            System.out.println("marks updated of "+this.name+" "+this.marks[index]+" -> "+marks);
            this.marks[index]=marks;
        }
    }
    double calculateAvg(){
        double sum=0;
        for(int val:marks)sum+=val;
        return sum/marks.length;
    }
    void printSummary(){
        System.out.println("\n--- Student Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Marks: ");
        for(int val:marks) System.out.print(val);
        System.out.println("\nAverage: " + calculateAvg());
        System.out.println("==========================");
    }
}