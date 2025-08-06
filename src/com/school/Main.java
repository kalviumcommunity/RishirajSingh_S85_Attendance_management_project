package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- School Attendance System ----");

        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");

        System.out.println("\nRegistered Students:");
        System.out.println("Student ID: " + student1.getStudentId() + ", Name: " + student1.getName());
        System.out.println("Student ID: " + student2.getStudentId() + ", Name: " + student2.getName());

        Course course1 = new Course("Intro to Programming");

        System.out.println("\nAvailable Courses:");
        System.out.println("Course ID: C" + course1.getCourseId() + ", Name: " + course1.getCourseName());

        System.out.println("\n---- Attendance Recording ----");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present"));

        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Late"));

        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Absent"));

        System.out.println("\n---- Attendance Log ----");
        for (AttendanceRecord record : attendanceLog) {
            System.out.println("Attendance: Student ID " + record.getStudentId() +
                    " in Course ID C" + record.getCourseId() +
                    " – Status: " + record.getStatus());
        }

        System.out.println("\nSession 4: Data Encapsulation & Attendance Recording Complete.");
    }
}
