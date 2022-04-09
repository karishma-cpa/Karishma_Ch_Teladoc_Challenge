package com.automation.utils;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        // Maximize
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Loading url in the browser
        driver.get(PropertyReader.getProperty("base.url"));
    }


    public static WebDriver getDriver() {
        return driver;
    }
}
