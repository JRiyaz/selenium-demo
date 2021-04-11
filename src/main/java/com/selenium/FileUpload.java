package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

    public static void main(String[] args) {

        final WebDriver edge = SetUp.get("http://demo.guru99.com/test/upload/", 3000);

        final WebElement fileUpload = edge.findElement(By.id("uploadfile_0"));
        fileUpload.sendKeys("E:\\Pictures\\Images\\1.jpg");

        edge.findElement(By.id("terms")).click();

        edge.findElement(By.name("send")).click();

        edge.quit();

        edge.close();
    }
}
