package com.school;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Rishi");
        students[0].displayDetails();
        students[1] = new Student();
        students[1].setDetails(2, "Raj");
        students[1].displayDetails();

        for(Student student : students) {
            student.displayDetails();
        }

        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(1, "OOPS using Java");
        courses[0].displayDetails();
        courses[1] = new Course();
        courses[1].setDetails(2, "Data Structures");
        courses[1].displayDetails();

        for(Course course : courses) {
            course.displayDetails();
        }
    }
}