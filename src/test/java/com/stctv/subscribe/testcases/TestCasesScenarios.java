package com.stctv.subscribe.testcases;

import com.stctv.subscribe.base.BaseTest;
import com.stctv.subscribe.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class TestCasesScenarios extends BaseTest {


    protected String actualCurrencyLite;
    protected String actualCurrencyClassic;
    protected String actualCurrencyPremium;


    @Test
    @Given("Open KSA Package")
    public void homePageKSATC1(){
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionSa();
        String ksa = homePage.getCurrentCountryName();
        Assert.assertEquals(ksa, "KSA");
    }
    @Test
    @When("Open Bahrain Package")
    public void homePageBHTC2(){
        HomePage homepage = new HomePage(driver);
        homepage.subscriptionBh();
        String bahrain = homepage.getCurrentCountryName();
        Assert.assertEquals(bahrain, "Bahrain");
    }
    @Test
    @When("Open Kuwait Package")
    public void openHomePageKWTC3(){
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionKw();
        String kuwait = homePage.getCurrentCountryName();
        Assert.assertEquals(kuwait, "Kuwait");
    }
    @Test
    @Then("Check KSA Currency")
    public void checkKSACurrencyTC4() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionSa();
        actualCurrencyLite = homePage.getCurrencyLite();
        actualCurrencyClassic = homePage.getCurrencyClassic();
        actualCurrencyPremium = homePage.getCurrencyPremium();
        Assert.assertEquals(actualCurrencyLite, "15 SAR/month");
        Assert.assertEquals(actualCurrencyClassic, "25 SAR/month");
        Assert.assertEquals(actualCurrencyPremium, "60 SAR/month");
    }

    @Test
    @Then("Check Kuwait Currency")
    public void checkKWCurrencyTC5() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionKw();
        actualCurrencyLite = homePage.getCurrencyLite();
        actualCurrencyClassic = homePage.getCurrencyClassic();
        actualCurrencyPremium = homePage.getCurrencyPremium();
        Assert.assertEquals(actualCurrencyLite, "1.2 KWD/month");
        Assert.assertEquals(actualCurrencyClassic, "2.5 KWD/month");
        Assert.assertEquals(actualCurrencyPremium, "4.8 KWD/month");
    }

    @Test
    @Then("Check Baharin Currency")
    public void checkBHCurrencyTC6() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionBh();
        actualCurrencyLite = homePage.getCurrencyLite();
        actualCurrencyClassic = homePage.getCurrencyClassic();
        actualCurrencyPremium = homePage.getCurrencyPremium();
        Assert.assertEquals(actualCurrencyLite, "2 BHD/month");
        Assert.assertEquals(actualCurrencyClassic, "3 BHD/month");
        Assert.assertEquals(actualCurrencyPremium, "6 BHD/month");
    }
    @Test
    @And("LITE Package")
    public void litePackageTC7() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionSa();
        homePage.selectPackageLITE();
        Assert.assertEquals(homePage.getTotalPrice(), "15.00 SAR/month");
    }
    @Test
    @And("CLASSIC Package")
    public void classicPackageTC8() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionSa();
        homePage.selectPackageCLASSIC();
        Assert.assertEquals(homePage.getTotalPrice(), "25.00 SAR/month");
    }
    @Test
    @And("PREMIUM Package")
    public void premiumPackageTC9() {
        HomePage homePage = new HomePage(driver);
        homePage.subscriptionSa();
        homePage.selectPackagePREMIUM();
        Assert.assertEquals(homePage.getTotalPrice(), "60.00 SAR/month");
    }

}