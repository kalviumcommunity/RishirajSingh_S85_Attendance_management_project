package com.school;

public class Teacher extends Person implements Storable {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Subject: " + subject + " (Role: Teacher)");
    }

    @Override
    public String toDataString() {
        return getId() + "," + getName() + "," + subject;
    }
}
