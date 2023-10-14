package com.stctv.subscribe.pages;

import com.google.api.client.util.Objects;
import com.stctv.subscribe.utils.ConfigUtils;
import jline.internal.Log;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
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



    //WebElements
    @FindBy(id = "country-btn")
    private WebElement countryBtn;
    @FindBy(css = "[id=\"country-name\"]")
    private WebElement countryName;
    @FindBy(css = "[id=\"name-lite\"]")
    private WebElement PlanLite;
    @FindBy(css = "[id=\"name-classic\"]")
    private WebElement PlanClassic;
    @FindBy(css = "[id=\"name-premium\"]")
    private WebElement PlanPremium;
    @FindBy(css = "[id=\"currency-lite\"]")
    private WebElement currencyLite;

    @FindBy(css = "[id=\"currency-classic\"]")
    private WebElement currencyClassic;

    @FindBy(css = "[id=\"currency-premium\"]")
    private WebElement currencyPremium;
    @FindBy(css = "[id=\"translation-btn\"]")
    private WebElement translateBtn;
    @FindBy(xpath = "//*[text()='Subscribe Now']")
    WebElement subscribeBtn;
    @FindBy(css = "[id=\"lite-selection\"]")
    WebElement startTrialLite;
    @FindBy(css = "[id=\"classic-selection\"]")
    WebElement startTrialClassic;
    @FindBy(css = "[id=\"premium-selection\"]")
    WebElement startTrialPremium;





    // Methods

    public HomePage load() {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }

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
    public String getCurrentCountryName(){
        return countryName.getText();
    }
    public void selectLanguageEN(){
        translateBtn.click();
        Log.info("Active EN mode");
    }
    public void selectLanguageAR(){
        translateBtn.click();
        Log.info("Active AR mode");
    }
    public List<String> getPlans(){
        List<String> plans = new ArrayList<>();
        plans.add(PlanLite.getText());
        plans.add(PlanClassic.getText());
        plans.add(PlanPremium.getText());
        Log.info("List plans names");
        return plans;
    }

    public String getCurrencyLite(){
        return currencyLite.getText();
    }

    public String getCurrencyClassic(){

        return currencyClassic.getText();
    }

    public String getCurrencyPremium(){
        return currencyPremium.getText();
    }
    public void clickSubscribe(){
        subscribeBtn.click();
    }

    public void selectPackageLITE(){
        startTrialLite.click();
    }
    public void selectPackageCLASSIC(){
        startTrialClassic.click();
    }
    public void selectPackagePREMIUM(){
        startTrialPremium.click();
    }


    @FindBy(className = "total-price")
    WebElement totalPrice;
    public String getTotalPrice(){
        return totalPrice.getText();
    }
}
