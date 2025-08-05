package com.school;

public class Student {
    private static int idCounter = 1;
    private int studentId;
    private String name;

    public Student(String name) {
        this.studentId = idCounter++;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
