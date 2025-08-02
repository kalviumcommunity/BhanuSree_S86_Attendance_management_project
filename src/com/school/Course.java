package com.school;

public class Course {
    public String courseCode;
    public String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void display() {
        System.out.println("Course - Code: " + courseCode + ", Name: " + courseName);
    }
}
