package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Edge {

    public static void main(String[] args) {

//        File file = new File("D:\\Softwares\\web-drivers\\msedgedriver.exe");

//        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        WebDriver edge = new EdgeDriver();

        edge.get("https://www.simplilearn.com");

        edge.manage()
                .window()
                .maximize();

        edge.manage()
                .timeouts()
                .implicitlyWait(3000, TimeUnit.MILLISECONDS);

        WebElement login = edge.findElement(By.linkText("Log in"));
        login.click();

        WebElement userName = edge.findElement(By.name("user_login"));
        userName.sendKeys("xyz@abc.com");

        WebElement password = edge.findElement(By.name("user_pwd"));
        password.sendKeys("simplilearn");

        WebElement rememberMe = edge.findElement(By.className("rememberMe"));
        rememberMe.click();

        WebElement loginButton = rememberMe.findElement(By.cssSelector("input.btn-signup"));
        loginButton.click();

        edge.quit();
        edge.close();
    }
}
