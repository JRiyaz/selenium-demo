package com.selenium.test_ng;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class TestGroup {

    @Test(groups = {"sanity"})
    @DisplayName("GroupTestOne")
    void groupTestOne() {
        System.out.println("From group Test One");
    }

    @Test
    @DisplayName("GroupTestTwo")
    void groupTestTwo() {
        System.out.println("From groupTestTwo");
    }

    @Test(groups = {"sanity"})
    @DisplayName("GroupTestThree")
    void groupTestThree() {
        System.out.println("From groupTestThree");
    }
}
