package com.selenium.test_ng;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class TestSampleTwo {

    @Test(description = "This is Test One")
    @DisplayName("TestOne")
    void TestOne() {
        System.out.println("Inside TestOne from TestSampleTwo");
    }

    @Test(enabled = false, dependsOnMethods = "TestOne")
    @DisplayName("TestTwo")
    void TestTwo() {
        System.out.println("Inside TestTwo from TestSampleTwo");
    }
}
