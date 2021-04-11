package com.selenium.test_ng;

import com.selenium.pages.LoginPage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestLogin {

    private WebDriver edge;
    private XSSFSheet sheet;

    @BeforeMethod
    void beforeTest() throws IOException {
//        File file = new File("D:\\Softwares\\web-drivers\\msedgedriver.exe");

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        edge = new EdgeDriver();

        edge.get("https://accounts.simplilearn.com/user/login");

        FileInputStream stream = new FileInputStream("excel-parameters.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(stream);
        sheet = book.getSheet("Sheet1");
    }

    //    Page Object Model (POM)
    //    @Test
    //    @Parameters(value = {"username", "password"})
    //    void testLogin(String username, String password) {
    @Test
    void testLogin() {

        edge.manage().window().maximize();

        edge.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        String username = sheet.getRow(0).getCell(0).getStringCellValue();
        String password = sheet.getRow(0).getCell(1).getStringCellValue();

        //        Page Object Model (POM)
        LoginPage loginPage = new LoginPage(edge);

        String actualMsg = loginPage.loginMethod(username, password);

        final String expectedMsg = "The email or password you have entered is invalid.";

        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @AfterMethod
    void afterTest() throws InterruptedException {
        Thread.sleep(2000);
		edge.quit();
    }
}
