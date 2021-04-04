package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountElements {

    public static void main(String[] args) {

        final WebDriver edge = SetUp.get("https://www.w3schools.com/html/html_tables.asp", 3000);

        List<WebElement> elements = edge.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));

        for (WebElement element : elements)
            System.out.println(element.getText());

//        ============================ Scroll Example ==============================
        final WebElement scrollTo = edge.findElement(By.xpath("//*[text()='HTML Table - Add a Caption']"));

        final JavascriptExecutor executor = (JavascriptExecutor) edge;
        executor.executeScript("arguments[0].scrollIntoView();", scrollTo);

//        Thread.sleep(5000);

//        edge.quit();
    }
}
