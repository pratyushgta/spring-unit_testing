/**
 * This class contains methods for creating Employee class to map into DB tables
 * MSA-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.unit_testingexample.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JUnitTest")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Long id;
    private String name;
    private String designation;
    private Double salary;
}
