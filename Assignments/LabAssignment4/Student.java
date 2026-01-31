package Assignments.LabAssignment4;

import java.util.function.Supplier;

public class Student extends Person{
    String program;
    long rollNo;
    int[]marks;
    public Student(){

    }
    public Student(String name,int age,String program,long rollNo,int[]arr){
        super(name,age);
        if(arr.length!=5)throw new InvalidMarksException("Student Must have Five Subjects only");
        for(int val:arr){
            if(val<0||val>100)throw new InvalidMarksException("Marks Should be between 0 - 100");
        }
        this.program=program;
        this.rollNo=rollNo;
        this.marks=arr;
    }
    public String grade(){
        int avg=0;
        for(int val:marks)avg+=val;
        avg=(int)avg/marks.length;
        if(avg>75)return "A";
        else if(avg>60)return "B";
        else if(avg>50)return "C";
        else if(avg>40)return "D";
        else return "Try Again";
    }
    @Override
    public void displayProfile(){
        super.displayProfile();
        System.out.println("Progarm : "+program+"\nRoll No : "+rollNo+"\nGrade : "+grade());
    }
}
