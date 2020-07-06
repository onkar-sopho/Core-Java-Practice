package com.company;

public class Student {
    String firstName;
    String lastName;
    String city;
    int age;

    Student(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getCity() {
        return this.city;
    }

    Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "[ First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Age: " + this.age + ", City: " + this.city + " ]";
    }
}
