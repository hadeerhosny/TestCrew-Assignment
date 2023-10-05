package com.stctv.subscribe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaPage {

    private WebDriver driver;

    public SaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"country\" ]")
    private WebElement country;


    // Select a Saudi arabian country
    @FindBy(css = "[id=\"sa-contry-flag\" ]")
    private WebElement saCountry;

    // Select a Baharin country
    @FindBy(css = "[id=\"bh-contry-flag\" ]")
    private WebElement bhCountry;


    // Select a Kuwait country
    @FindBy(css = "[id=\"kw-contry-flag\" ]")
    private WebElement kwCountry;

    // Webelement for Type, Price and Currency
    @FindBy(css = "[id=\"name-lite\"]")
    private WebElement typeLite;

    @FindBy(css = "[id=\"name-classic\"]")
    private WebElement typeClassic;

    @FindBy(css = "[id=\"name-premium\"]")
    private WebElement typePremium;

    @FindBy(css = "[id=\"currency-lite\"]")
    private WebElement currencyLite;

    @FindBy(css = "[id=\"currency-classic\"]")
    private WebElement currencyClassic;

    @FindBy(css = "[id=\"currency-premium\"]")
    private WebElement currencyPremium;

    public void subscriptionSa(){
        country.click();
        saCountry.click();

    }

    public void subscriptionKw(){
        country.click();
        kwCountry.click();

    }

    public void subscriptionBh(){
        country.click();
        bhCountry.click();

    }
    // methods for packages
    public String getLiteTitle(){
        return typeLite.getText();
    }

    public String getClassicTitle(){
        return typeClassic.getText();
    }

    public String getLitePremiumTitle(){
        return typePremium.getText();
    }

    //methods for currency
    public String getCurrencyLite(){
        return currencyLite.getText();
    }

    public String getCurrencyClassic(){
        return currencyClassic.getText();
    }

    public String getCurrencyPremium(){
        return currencyPremium.getText();
    }
}
