/**
 * This class contains methods for implementing service class
 * MSA-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */


package com.example.unit_testingexample.service;

import com.example.unit_testingexample.entity.Employee;
import com.example.unit_testingexample.reporistory.EmployeeCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeCrudRepo crudRepo;

    // CREATE: to create repository instance method call
    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmp = crudRepo.save(employee);
        return savedEmp;
    }

    // RETRIEVE
    @Override
    public List<Employee> getAllEmployees() {
        //find all returns a list
        return crudRepo.findAll();
    }
}
