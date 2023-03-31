package com.sparta.employee;

import com.sparta.factory.EmployeeFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeStarter {
    private static final Logger logger = LogManager.getLogger(EmployeeStarter.class);

    public static void start() {
        try {
//            Scanner scanner1 = new Scanner(System.in);
//            System.out.print("How many employees would you like printed:");
//            int ans = 1000;
            Random rand = new Random(); int randomNum = rand.nextInt(1000) + 1;
            System.out.println(randomNum + " Number of Employees");
            String[] employeeDataArray = EmployeeFactory.getEmployees(randomNum);
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

                Employee employee = new Employee(Integer.parseInt(data[0]), data[7], data[2],data[4], data[5],data[8]);
                employeeList.add(employee);
            }

            // Print the employeeList
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }

            // Search for employee
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an employee Last Name to search for: ");
            String searchName = scanner.next();

            boolean foundEmployee = false;
            for (Employee employee : employeeList) {
                if (employee.getLastName().equalsIgnoreCase(searchName)) {//raf change
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
            logger.error("An error occurred while getting employee data from the factory: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            logger.error("An error occurred, please input an integer and not characters! " + e.getMessage());
            e.printStackTrace();}

    }
}
