package Leetcode.Assignments.Unit2LabAssignment.lab_assignment_05.unit2.task2.src.model;

public class Student {
    private int id;
    protected String name;
    int age;
    public String course;
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public int getId() {
        return id;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
