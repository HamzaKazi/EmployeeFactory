package com.sparta.service;

import com.sparta.employee.Employee;
import com.sparta.tree.BinarySearchTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private BinarySearchTree<Employee> employeeTree;

    public void readEmployeesFromCSV() {
        List<Employee> employeeList = new ArrayList<>();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("employees.csv");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                Employee employee = new Employee(Integer.parseInt(fields[0]),fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7], fields[8], Integer.parseInt(fields[9]));
                employeeList.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        employeeTree = new BinarySearchTree<Employee>(employeeList);



    }

    public BinarySearchTree<Employee> getEmployeeTree() {
        return employeeTree;
    }
}
