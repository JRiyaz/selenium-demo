package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

    public static void main(String[] args) {

        final WebDriver edge = SetUp.get("https://www.facebook.com", 3000);

//        final WebElement createAccount = edge.findElement(By.xpath("//a[contains(text(), 'Create New')]"));
//        final WebElement createAccount = edge.findElement(By.xpath("//a[text()='Create New Account']"));
        final WebElement createAccount = edge.findElement(By.xpath("//a[starts-with(text(), 'Create New')]"));
        createAccount.click();

        final WebElement firstName = edge.findElement(By.xpath("//input[@name='firstname']"));
        sendKeys(firstName, "dummy");

        final WebElement lastName = edge.findElement(By.xpath("//input[@name='lastname']"));
        sendKeys(lastName, "fake");

        String emailId = "dymmy@fake.com";
        final WebElement email = edge.findElement(By.xpath("//input[@name='reg_email__']"));
        sendKeys(email, emailId);

        final WebElement confirmEmail = edge.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        sendKeys(confirmEmail, emailId);

//        final WebElement password = edge.findElement(By.xpath("//input[@id='password_step_input']"));
        final WebElement password = edge.findElement(By.xpath("//*[@type='password' and @id='password_step_input']"));
        sendKeys(password, "dymmyFake@123");

        final WebElement gender = edge.findElement(By.xpath("//*[@type='radio' and @value='2']"));
        gender.click();

        final WebElement month = edge.findElement(By.xpath("//select[@title='Month']"));
        final Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Jun");

        final WebElement day = edge.findElement(By.xpath("//select[@title='Day']"));
        final Select selectDay = new Select(day);
        selectDay.selectByIndex(16);

        final WebElement year = edge.findElement(By.cssSelector("select#year"));
        final Select selectYear = new Select(year);
        selectYear.selectByValue("1995");

        final WebElement submitButton = edge.findElement(By
                .xpath("//button[@type='submit' and @name='websubmit']"));
        submitButton.click();

        edge.quit();
        edge.close();

        /*
            Parent and Sibling relation

            1. //select[@title='Day']//preceding::select
            2. //select[@title='Day']//following::select
            3. //select[@title='Day']/option[2]

            CSS Selector

            1. input#email
            2. input.email
            3. input[id=email]
            4. Tag and Class
                Syntax : “css = tag.class”
                Example : driver.findElement(By.cssSelector(”input.inputtext”));
            5. Tag and ID
                Syntax :”css = tag#id”
                Example :  driver.findElement(By.cssSelector(“input#email”));
            6. Tag and Attribute
                Syntax : “css = tag[attribute=value]”
         */
    }

    //    This is how to handle exception, whenever the element doesn't exists
    public static void sendKeys(final WebElement element, final String key) {
        try {
            element.sendKeys(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
