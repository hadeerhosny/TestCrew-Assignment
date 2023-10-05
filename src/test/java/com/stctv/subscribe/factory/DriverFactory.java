package com.stctv.subscribe.factory;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    @Given("User selects one of the countries")
    public WebDriver initializeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://subscribe.stctv.com/sa-en");
        driver.manage().window().maximize();
        return driver;
    }

}
