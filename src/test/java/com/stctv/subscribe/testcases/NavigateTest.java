package com.stctv.subscribe.testcases;
import com.shaft.driver.SHAFT;
import com.stctv.subscribe.base.BaseTest;
import com.stctv.subscribe.pages.SaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateTest extends BaseTest {
    SHAFT.GUI.WebDriver Browser = new SHAFT.GUI.WebDriver();
    protected String actualLiteTitle;
    protected String actualClassicTitle;
    protected String actualPremiumTitle;
    protected String actualCurrencyLite;
    protected String actualCurrencyClassic;
    protected String actualCurrencyPremium;



    // Happy Scenario
    @Given("User selects one of the countries")
    @Test
    public void SubscriptionSaudiArabiaTC1() {

        SaPage sapage = new SaPage(driver);
        sapage.subscriptionSa();
        actualLiteTitle = sapage.getLiteTitle();
        actualClassicTitle = sapage.getClassicTitle();
        actualPremiumTitle = sapage.getLitePremiumTitle();
        actualCurrencyLite = sapage.getCurrencyLite();
        actualCurrencyClassic = sapage.getCurrencyClassic();
        actualCurrencyPremium = sapage.getCurrencyPremium();

        //Validate the Subscription Packages Type, Price and Currency
        Assert.assertEquals(actualLiteTitle, "LITE");
        Assert.assertEquals(actualClassicTitle, "CLASSIC");
        Assert.assertEquals(actualPremiumTitle, "PREMIUM");
        Assert.assertEquals(actualCurrencyLite, "15 SAR/month");
        Assert.assertEquals(actualCurrencyClassic, "25 SAR/month");
        Assert.assertEquals(actualCurrencyPremium, "60 SAR/month");



    }

    // Happy Scenario
    @When("User Validate the Subscription Packages Type, Price and Currency")
    @Test
    public void SubscriptionKuwaitTC2() {
        SaPage kwpage = new SaPage(driver);
        kwpage.subscriptionKw();

        actualLiteTitle = kwpage.getLiteTitle();
        actualClassicTitle = kwpage.getClassicTitle();
        actualPremiumTitle = kwpage.getLitePremiumTitle();
        actualCurrencyLite = kwpage.getCurrencyLite();
        actualCurrencyClassic = kwpage.getCurrencyClassic();
        actualCurrencyPremium = kwpage.getCurrencyPremium();

        Assert.assertEquals(actualLiteTitle, "LITE");
        Assert.assertEquals(actualClassicTitle, "CLASSIC");
        Assert.assertEquals(actualPremiumTitle, "PREMIUM");
        Assert.assertEquals(actualCurrencyLite, "1.2 KWD/month");
        Assert.assertEquals(actualCurrencyClassic, "2.5 KWD/month");
        Assert.assertEquals(actualCurrencyPremium, "4.8 KWD/month");





    }

    // Failed Scenario
    @Then("User knows the data of each packages")
    @Test
    public void SubscriptionBaharinTC3() {
        SaPage bhpage = new SaPage(driver);
        bhpage.subscriptionBh();

        actualLiteTitle = bhpage.getLiteTitle();
        actualClassicTitle = bhpage.getClassicTitle();
        actualPremiumTitle = bhpage.getLitePremiumTitle();
        actualCurrencyLite = bhpage.getCurrencyLite();
        actualCurrencyClassic = bhpage.getCurrencyClassic();
        actualCurrencyPremium = bhpage.getCurrencyPremium();

        Assert.assertEquals(actualLiteTitle, "LITE");
        Assert.assertEquals(actualClassicTitle, "CLASSIC");
        Assert.assertEquals(actualPremiumTitle, "PREMIUM");
        Assert.assertEquals(actualCurrencyLite, "1 BHD/month");
        Assert.assertEquals(actualCurrencyClassic, "3 BHD/month");
        Assert.assertEquals(actualCurrencyPremium, "6 BHD/month");


    }




}



