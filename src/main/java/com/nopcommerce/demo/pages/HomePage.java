package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registrationLink;


   // method for clicking on login link
    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
        Reporter.log("Clicking on login link : " + _loginLink.toString() + "<br>");
        log.info("Clicking on Login link : " +_loginLink.toString());
    }
    //method of clicking on register link
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + _registrationLink.toString() + "<br>");
        clickOnElement(_registrationLink);
        log.info("Clicking on login link : " + _registrationLink.toString());
    }
}
