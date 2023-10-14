package com.stctv.subscribe.factory;

import com.stctv.subscribe.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectManager {
    private final WebDriver webDriver;
    private HomePage homePage;

    public PageObjectManager(WebDriver webDriver){
        this.webDriver =webDriver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }
}
