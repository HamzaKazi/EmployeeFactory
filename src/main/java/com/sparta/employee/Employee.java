package com.sparta.employee;

public class Employee {
    private int empID;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private String dob;
    private String joiningDate;
    private int salary;

    public Employee(int empID, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String email, String dob, String joiningDate, int salary) {
        this.empID = empID;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " " +
                " " + empID +
                ", " + namePrefix +
                ", " + firstName +
                ", " + middleInitial +
                ", " + lastName +
                ", " + gender +
                ", " + email +
                ", " + dob +
                ", " + joiningDate +
                ", " + salary +
                ' ';
    }

    public Employee(int empNo, String birthDate, String firstName, String lastName, char gender, String hireDate) {

    }

    // Add getters and setters here
}
