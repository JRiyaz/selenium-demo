package com.selenium.test_ng;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class ParallelTests {

    @Test
    @DisplayName("Open Chrome")
    void openChrome() {
        File file = new File("D:\\Softwares\\web-drivers\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.simplilearn.com/user/login");
    }

    @Test
    @DisplayName("Open Edge")
    void openEdge() {

        File file = new File("D:\\Softwares\\web-drivers\\msedgedriver.exe");

        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());

        WebDriver driver = new EdgeDriver();

        driver.get("https://accounts.simplilearn.com/user/login");
    }
}
