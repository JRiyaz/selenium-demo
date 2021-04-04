package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Chrome {

    public static void main(String[] args) {

        File file = new File("D:\\Softwares\\web-drivers\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://www.simplilearn.com");

        chrome.manage()
                .window()
                .maximize();

        chrome.manage()
                .timeouts()
                .implicitlyWait(3000, TimeUnit.MILLISECONDS);

        WebElement loginLink = chrome.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = chrome.findElement(By.name("user_login"));
        emailField.sendKeys("abc@xyz.com");

        WebElement passwordField = chrome.findElement(By.name("user_pwd"));
        passwordField.sendKeys("simplilearn");

        WebElement rememberMe = chrome.findElement(By.className("rememberMe"));
        rememberMe.click();

        WebElement loginButton = chrome.findElement(By.name("btn_login"));
        loginButton.click();

        chrome.quit();
        chrome.close();
    }
}
