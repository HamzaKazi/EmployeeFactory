package com.sparta.employee;
import java.util.Objects;


public class Employee implements Comparable<Employee> {
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

    public Employee(int empID, String dob, String firstName,  String lastName, String gender, String joiningDate) {
        this.empID = empID;
      //  this.namePrefix = namePrefix;
        this.firstName = firstName;
        // this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
       // this.email = email;
        this.dob = dob;
        this.joiningDate = joiningDate;
        //this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.empID, o.empID);
    }

    @Override
    public String toString() {
        return empID + ", " + dob +","+ firstName + ", " + lastName + ", " + gender + ", "  + joiningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                gender == employee.gender &&
                Objects.equals(dob, employee.dob) &&
                Objects.equals(joiningDate, employee.joiningDate);
    }


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
