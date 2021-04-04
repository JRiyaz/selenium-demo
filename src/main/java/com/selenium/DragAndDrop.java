package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        final WebDriver edge = SetUp.get("http://demo.guru99.com/test/drag_drop.html", 3000);

        final WebElement element = edge.findElement(By.xpath("//li[@id='credit2']/a"));

        final WebElement dropLocation = edge.findElement(By.xpath("//*[@id='bank']/li"));

        final Actions action = new Actions(edge);

        action.dragAndDrop(element, dropLocation)
                .build()
                .perform();
    }
}
