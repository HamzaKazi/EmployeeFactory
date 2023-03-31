package com.sparta;

import com.sparta.employee.Employee;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private static final Logger logger = LogManager.getLogger(EmployeeTest.class);

    @Test
    public void testToString() {
        Employee employee = new Employee(123, "Mr", "John", "D", "Cena", "Male", "john.cena@wwe.com", "01/01/1990", "01/01/2020", 50000);
        String expected = "123, Mr, John, D, Cena, Male, john.cena@wwe.com, 01/01/1990, 01/01/2020, 50000";
        String actual = employee.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorAndGetters() {
        Employee employee = new Employee(123, "Mr", "John", "D", "Cena", "Male", "john.cena@wwe.com", "01/01/1990", "01/01/2020", 50000);

        assertEquals(123, employee.getEmpID());
        assertEquals("Mr", employee.getNamePrefix());
        assertEquals("John", employee.getFirstName());
        assertEquals("D", employee.getMiddleInitial());
        assertEquals("Cena", employee.getLastName());
        assertEquals("Male", employee.getGender());
        assertEquals("john.cena@wwe.com", employee.getEmail());
        assertEquals("01/01/1990", employee.getDob());
        assertEquals("01/01/2020", employee.getJoiningDate());
        assertEquals(50000, employee.getSalary());
    }



}
