package com.sparta.employee;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeStarter {
    public static void start() {
        try {
            String[] employeeDataArray = com.sparta.employees.EmployeeFactory.getEmployees(5);
            List<Employee> employeeList = new ArrayList<>();

            for (String employeeData : employeeDataArray) {
                String[] data = employeeData.split("\t");
                int empID = Integer.parseInt(data[0]);
                String namePrefix = data[1];
                String firstName = data[2];
                String middleInitial = data[3];
                String lastName = data[4];
                String gender = data[5];
                String email = data[6];
                String dob = data[7];
                String joiningDate = data[8];
                int salary = Integer.parseInt(data[9]);

                Employee employee = new Employee(empID, namePrefix, firstName, middleInitial, lastName, gender, email, dob, joiningDate, salary);
                employeeList.add(employee);
            }

            // Print the employeeList
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
