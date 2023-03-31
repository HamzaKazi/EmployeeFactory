package com.sparta.employee;

import com.sparta.factory.EmployeeFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeStarter {
    public static void start() {
        try {
            String[] employeeDataArray = EmployeeFactory.getEmployees(10);
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

            // Search for employee
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an employee ID to search for: ");
            int searchID = scanner.nextInt();

            boolean foundEmployee = false;
            for (Employee employee : employeeList) {
                if (employee.getEmpID() == searchID) {
                    System.out.println("Found employee:");
                    System.out.println(employee);
                    foundEmployee = true;
                    break;
                }
            }

            if (!foundEmployee) {
                System.out.println("Employee not found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
