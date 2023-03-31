package com.sparta;

import com.sparta.employee.Employee;
import com.sparta.tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest {

    private BinarySearchTree<Employee> bst;

    @BeforeEach
    public void setUp() {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "01/01/1990", "John", "Doe", "Male", "01/01/2010"),
                new Employee(102, "02/02/1990", "Jane", "Doe", "Female", "02/02/2010"),
                new Employee(103, "03/03/1990", "Bob", "Smith", "Male", "03/03/2010"),
                new Employee(104, "04/04/1990", "Alice", "Johnson", "Female", "04/04/2010")
        );
        bst = new BinarySearchTree<>(employees);
    }

    @Test
    public void testInsert() {
        Employee employee = new Employee(105, "05/05/1990", "Jack", "Brown", "Male", "05/05/2010");
        bst.insert(employee);
        List<Employee> result = bst.search(employee);
        assertEquals(1, result.size());
        assertEquals(employee, result.get(0));
    }

    @Test
    public void testSearch() {
        Employee employee = new Employee(103, "03/03/1990", "Bob", "Smith", "Male", "03/03/2010");
        List<Employee> result = bst.search(employee);
        assertEquals(1, result.size());
        assertEquals(employee, result.get(0));
    }
}
