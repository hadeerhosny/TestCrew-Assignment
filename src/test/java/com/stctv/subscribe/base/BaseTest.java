package com.stctv.subscribe.base;

import com.stctv.subscribe.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new DriverFactory().initializeDriver();
        System.out.println("================ BEFORE Class ================");
    }

    @AfterClass
    public void teardown(){
        driver.quit();
        System.out.println("================ AFTER Class ================");
    }
}
