/**
 * This class contains methods for implementing service class
 * MSA-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.unit_testingexample.service;

import com.example.unit_testingexample.entity.Employee;
import com.example.unit_testingexample.reporistory.EmployeeCrudRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeControllerTest {

    @Autowired
    private EmployeeCrudRepo crudRepo;

    @Autowired
    private EmployeeService employeeService;

    private Employee employee1, employee2;

    @BeforeEach
    public void setupTestData() {
        employee1 = new Employee(0L, "Tiger", "Exec", 1000.0);
        employee2 = new Employee(100L, "Raju", "Manager", 1500.0);
    }

    @Test
    @DisplayName("JUnit test1 to test saving operation")
    public void testSaving1() {
        Employee saveEmployee = crudRepo.save(employee2);
        assertThat(saveEmployee).isNotNull();
        assertThat(saveEmployee.getId()).isGreaterThan(0);
    }

    @Test
    @DisplayName("JUnit test2 to test saving operation")
    public void testSaving2() {
        Employee saveEmployee = crudRepo.save(employee1);
        assertThat(saveEmployee).isNotNull();
        assertThat(saveEmployee.getId()).isGreaterThan(0);
    }

    @Test
    @DisplayName("JUnit test1 to test retrieval operation")
    void getAllEmployees() {
        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);

        List<Employee> list = crudRepo.findAll();
        assertThat(list).isNotEmpty();
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("JUnit test for assertNotNull")
    void testNotNull() {
        assertNotNull(employee1);
        assertNotNull(employee2);
    }

    @Test
    @DisplayName("JUnit test for assertNull")
    void testNull() {
        Employee nullEmployee = null;
        assertNull(nullEmployee);
    }

    @Test
    @DisplayName("JUnit test for assertTrue")
    void testTrue() {
        assertTrue(employee1.getId() == 0L);
    }

    @Test
    @DisplayName("JUnit test for assertFalse")
    void testFalse() {
        assertFalse(employee2.getId() == 0L);
    }
}
