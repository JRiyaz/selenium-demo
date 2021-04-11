package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SetUp {

    public static WebDriver get(final String url, final int time) {

//        final File file = new File("D:\\Softwares\\web-drivers\\msedgedriver.exe");

//        System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        final WebDriver edge = new EdgeDriver();
        edge.get(url);

        edge.manage()
                .window()
                .maximize();

        edge.manage()
                .timeouts()
                .implicitlyWait(time, TimeUnit.MILLISECONDS);

        return edge;
    }
}
