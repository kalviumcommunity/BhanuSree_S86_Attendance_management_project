package com.school;

public class Student {
    public int rollNumber;
    public String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void display() {
        System.out.println("Student - Roll No: " + rollNumber + ", Name: " + name);
    }
}
