package com.sparta;

import com.sparta.employee.Employee;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {
    private static final Logger logger = LogManager.getLogger(EmployeeTest.class);

    @Test
    public void testToString() {
        Employee employee = new Employee(123, "01/01/1990"," John","Cena","Male", "01/01/2020");
        String expected = "123, 01/01/1990, John, Cena, Male, 01/01/2020";
        String actual = employee.toString();
        assertEquals(expected, actual);
    }
// test
    @Test
    public void testConstructorAndGetters() {
        Employee employee = new Employee(123, "01/01/1990","John","Cena","Male", "01/01/2020");

        assertEquals(123, employee.getEmpID());
        assertEquals("John", employee.getFirstName());
        assertEquals("Cena", employee.getLastName());
        assertEquals("Male", employee.getGender());
        assertEquals("01/01/1990", employee.getDob());
        assertEquals("01/01/2020", employee.getJoiningDate());
    }

                                //Requirement testing: The tree should allow for multiple employees with the same last_name
        @Test
        public void testSearchEmployeeByLastName() {
            Employee e1 = new Employee(1, "01/01/1990","John", "Doe","Male", "01/01/2020");
            Employee e2 = new Employee(2, "01/01/1980","Batista", "Doe","Male", "06/01/2020");
            Employee e3 = new Employee(3, "01/01/1930","Triple", "H","Female", "01/01/2020");
            Employee e4 = new Employee(4, "01/01/1900","Big", "Show","Male", "01/01/2020");

            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(e1);
            employeeList.add(e2);
            employeeList.add(e3);
            employeeList.add(e4);

            String searchLastName = "Doe";
            List<Employee> searchResults = new ArrayList<>();

            for (Employee employee : employeeList) {
                if (employee.getLastName().equals(searchLastName)) {
                    searchResults.add(employee);
                }
            }

            assertEquals(2, searchResults.size());
            assertTrue(searchResults.contains(e1));
            assertTrue(searchResults.contains(e2));
        }

        // Add test for Exceptions
    }

