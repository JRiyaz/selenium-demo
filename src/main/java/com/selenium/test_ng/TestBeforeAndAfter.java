package com.selenium.test_ng;

import org.testng.annotations.*;

public class TestBeforeAndAfter {

    @BeforeTest
    void beforeTest() {
        System.out.println("Before the test");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("From beforeMethod");
    }

    @Test
    void testOne() {
        System.out.println("Inside TestOne");
    }

    @Test
    void testTwo() {
        System.out.println("Inside TestTwo");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("From afterMethod");
    }

    @AfterTest
    void afterTest() {
        System.out.println("After the test");
    }
}
