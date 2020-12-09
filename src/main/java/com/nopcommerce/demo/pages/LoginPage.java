package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;

    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)")
    WebElement _errorMessage;


    //method to enter email id to email field
    public void enterEmailId(String email,int timeout) {
        Reporter.log("Entering email address : " + email + " to email field : " + _emailField.toString() + "<br>");
        waitUntilPresenceOfElementLocated(By.id("Email"),5);
        log.info("Entering email address : " + email + " to email field : " + _emailField.toString());
    }
    //method to enter password to password field
    public void enterPassword(String password, int timeout) {
        Reporter.log("Entering password : " + password + " to password field : " + _passwordField.toString() + "<br>");
        waitUntilPresenceOfElementLocated(By.id("password"),5);
        log.info("Entering password : " + password + " to password field : " + _passwordField.toString());
    }
    //method to click on login button
    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on login button : " + _loginBtn.toString());
    }
    //method to confirm welcome text
    public String getWelcomeText() {
        Reporter.log("Getting text from : " + _welcomeText.toString() + "<br>");
        log.info("Getting text from : " + _welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }
    // method to verify error messsage
    public String getErrorMessage() {
        return getTextFromElement(_errorMessage);
    }
}
