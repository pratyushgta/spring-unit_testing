/**
 * This class contains methods for implementing methods containing test cases
 * MSA-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package com.example.unit_testingexample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertTrue;

@SpringBootTest
public class HelloWorldTest {

    @BeforeAll // to execute an expensive common operation before each test
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeEach // useful when we want to execute some common code before running a test
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test 1");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Is num1 greater than num2? ", helloWorld.isGreater(4, 3));
    }

    @Test
    public void isEqualTest() {
        System.out.println("Test 2");
        JUnitHelloWorld helloWorld = new JUnitHelloWorld();
        assertTrue("Are the strings equal? ", helloWorld.isEqual("Apples"));
    }

    @AfterEach
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After Class");
    }
}
