/**
 * This class contains methods for implementing service interface
 * MSA-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.example.unit_testingexample.service;



import com.example.unit_testingexample.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface{
   Employee addEmployee(Employee employee);

   List<Employee> getAllEmployees();
}
