package com.stctv.subscribe.base;

import com.stctv.subscribe.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new DriverFactory().initializeDriver();
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
