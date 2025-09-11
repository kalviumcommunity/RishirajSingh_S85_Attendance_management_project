package com.school;

public class Staff extends Person implements Storable {
    private String department;

    public Staff(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Department: " + department + " (Role: Staff)");
    }

    @Override
    public String toDataString() {
        return getId() + "," + getName() + "," + department;
    }
}
