package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Page Object Model (POM)
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String loginMethod(String username, String password) {


        final WebElement userName = driver.findElement(By.name("user_login"));
        userName.sendKeys(username);

        final WebElement pass = driver.findElement(By.name("user_pwd"));
        pass.sendKeys(password);

        final WebElement rememberMe = driver.findElement(By.className("rememberMe"));
        rememberMe.click();

        final WebElement loginButton = rememberMe.findElement(By.xpath("//input[@name='btn_login']"));
        loginButton.click();

        final WebElement message = driver.findElement(By.id("msg_box"));
        final String actualMsg = message.getText();

        return actualMsg;
    }
}
