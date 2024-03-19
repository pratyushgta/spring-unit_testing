/**
 * This class contains methods for initializing JPA repository to perform CRUD
 * MSA-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.unit_testingexample.reporistory;

import com.example.unit_testingexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Long> {
}


