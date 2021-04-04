package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        final WebDriver edge = SetUp.get("http://demo.guru99.com/test/delete_customer.php", 3000);

        edge.findElement(By.name("cusid")).sendKeys("56256");
        edge.findElement(By.name("submit")).submit();

        Alert alert = edge.switchTo()
                .alert();

        System.out.println(alert.getText());

        Thread.sleep(2000);
        alert.accept();
    }
}
