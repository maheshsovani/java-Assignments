package com.step.assignments;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }

    public boolean isTeen() {
        return this.age < 20 && this.age > 12;
    }
}
