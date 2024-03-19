/**
 * This class contains methods for implementing service class
 * MSA-E2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.unit_testingexample.service;



import com.example.unit_testingexample.reporistory.EmployeeCrudRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.willReturn;

@Service
public class EmployeeServiceTest2 {
    @Autowired
    EmployeeCrudRepo crudRepo;
    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @Test
    public void isEqualTest() {
        System.out.println("Test 2");
        //var EmployeeList = crudRepo.getAllEmployees();
        //assertThat(EmployeeList).isNotNull();
        //assertThat(EmployeeList.size()).isEqualTo(2);
    }
}
