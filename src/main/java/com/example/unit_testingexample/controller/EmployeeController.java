/**
 * This class contains methods for implementing controller for SpringBoot Application
 * MSA-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

// controller to handle HTTP requests to the application
package com.example.unit_testingexample.controller;

import com.example.unit_testingexample.entity.Employee;
import com.example.unit_testingexample.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/display")
    String display() {
        return "Hello World";
    }

    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    //POST: http://localhost:8080/save  Put JSON info in body
    @PostMapping("/save") //map only POST requests
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee saved;
        try {
            saved = employeeServiceInterface.addEmployee(employee);
        } catch (Exception e) {
            return new ResponseEntity("Error!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //Response entity is an object used to return to client to tell what happened inside service
        //return new ResponseEntity<Employee>("Saved: "+saved, HttpStatus.CREATED);
        return new ResponseEntity("Saved: " + saved.getId(), HttpStatus.CREATED);
    }

    //GET: http://localhost:8080/all
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = employeeServiceInterface.getAllEmployees();
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }
}
