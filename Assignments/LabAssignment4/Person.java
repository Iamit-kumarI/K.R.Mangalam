package Leetcode.Assignments.LabAssignment4;

import java.sql.SQLOutput;

public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        if(age<17)throw new InvalidAgeException("Age Should be above 17");
        this.name=name;
        this.age=age;
    }
    public void displayProfile(){
        System.out.println(" ========== Profile Summary ======== ");
        System.out.println("Name : "+name+"\nAge : "+age);
    }
}
