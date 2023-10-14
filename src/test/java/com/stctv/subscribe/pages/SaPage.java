package com.stctv.subscribe.pages;

import com.stctv.subscribe.utils.ConfigUtils;
import com.stctv.subscribe.utils.PropertiesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class SaPage {

    private WebDriver driver;

    public SaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[id=\"country-btn\"]")
    private WebElement countryBtn;

    @FindBy(css = "[id=\"country-name\"]")
    private WebElement countryName;
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

    @FindBy(css = "[class=\"plan-names\"]")
    private WebElement totalPrice;

    @FindBy(id = "translation-btn")
    private WebElement translateBtn;

    @FindBy(className = "//*[@class='form-btn']")
    WebElement redeemBtn;

    @FindBy(className = "//*[@class='error-msg']")
    WebElement errorMsg;

    @FindBy(className = "form-btn")
    private WebElement activateBtn;

    @FindBy(id = "mobile")
    WebElement mobileNumberField;

    @FindBy(xpath = "//*[text()='Subscribe Now']")
    WebElement subscribeBtn;

    @FindBy(id = "lite-selection")
    WebElement startTrialLite;
    @FindBy(id = "classic-selection")
    WebElement startTrialClassic;
    @FindBy(id = "premium-selection")
    WebElement startTrialPremium;


    public SaPage load() {
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
    public String getTotalPrice(){
        return totalPrice.getText();
    }
    public void startTrial(String plan){
        if (Objects.equals(plan, "LITE")){
            startTrialLite.click();
        }
        else if (Objects.equals(plan, "classic")){
            startTrialClassic.click();
        }
        else if (Objects.equals(plan, "PREMIUM")){
            startTrialPremium.click();
        }
        else {
            System.out.println("incorrect plan name");
        }
    }

    public void clickSubscribe(){
        subscribeBtn.click();
    }

    public void enterMobileNumber(String number){
        mobileNumberField.sendKeys(number);
    }

    public void clickActivateBtn(){
        activateBtn.click();
    }

    public String getErrorMsg(){
        return errorMsg.getText();
    }

    public void clickRedeemBtn(){
        redeemBtn.click();
    }
    public void changeLangToAr(){
        translateBtn.click();
    }

    public void changeLangToEn(){
        translateBtn.click();
    }

    public void clickOnCountryName(){
        countryBtn.click();
    }

    public String getCurrentCountryName(){
        return countryName.getText();
    }
    @FindBy(xpath = "//*[@id='currency-lite']/i")
    private WebElement liteCurrency;
    @FindBy(xpath = "//*[@id='currency-lite']/b")
    private WebElement litePrice;
    @FindBy(xpath = "//*[@id='currency-classic']/i")
    private WebElement clasicCurrency;
    @FindBy(xpath = "//*[@id='currency-classic']/b")
    private WebElement classicPrice;
    @FindBy(xpath = "//*[@id='currency-premium']/i")
    private WebElement premiumCurrency;
    @FindBy(xpath = "//*[@id='currency-premium']/b")
    private WebElement premiumPrice;
    public List<String> getPrices(){
        List<String> prices = new ArrayList<>();
        prices.add(litePrice.getText() + " " + liteCurrency.getText());
        prices.add(classicPrice.getText() + " " + clasicCurrency.getText());
        prices.add(premiumPrice.getText() + " " + premiumCurrency.getText());
        return prices;
    }

    @FindBy(id = "name-lite")
    private WebElement planLite;
    @FindBy(id = "name-classic")
    private WebElement planClassic;
    @FindBy(id = "name-premium")
    private WebElement planPremium;

    public List<String> getPlans(){
        List<String> plans = new ArrayList<>();
        plans.add(planLite.getText());
        plans.add(planClassic.getText());
        plans.add(planPremium.getText());
        return plans;
    }


}
