package com.school;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[2];
        students[0] = new Student(101, "Alice");
        students[1] = new Student(102, "Bob");

        Course[] courses = new Course[2];
        courses[0] = new Course("CSE101", "Computer Science");
        courses[1] = new Course("MAT101", "Mathematics");

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\nCourse Details:");
        for (Course c : courses) {
            c.display();
        }
    }
}
