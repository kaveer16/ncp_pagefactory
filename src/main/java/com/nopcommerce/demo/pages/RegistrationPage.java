package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement _maleOption;
    @FindBy(css = "#FirstName")
    WebElement _firstNameField;
    @FindBy (css = "#LastName")
    WebElement _lastNameField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement _dayField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement _monthField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement _yearField;
    @FindBy(css = "#Email")
    WebElement _emailField;
    @FindBy(css = "#Company")
    WebElement _companyField;
    @FindBy(css = "#Newsletter")
    WebElement _newsLetterCheckbox;
    @FindBy(css = "#Password")
    WebElement _passwordField;
    @FindBy(css = "#ConfirmPassword" )
    WebElement _confirmPasswordField;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerButton;
    @FindBy(xpath = "html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]" )
    WebElement _yourRegistrationCompleted;

    // method for choosing male option radio button
    public void choosingMaleOption(){
        Reporter.log("Clicking on male option radio button" + _maleOption.toString() + "<br>");
        log.info("Clicking on male option radio button" + _maleOption.toString());
        clickOnElement(_maleOption);
    }
    // method to enter name to first name field
    public void enterFirstName(String firstname){
        Reporter.log("Enter first name" + firstname + " to first name field" + _firstNameField.toString() + "<br>");
        log.info("Enter first name" + firstname + " to first name field" + _firstNameField.toString());
        sendTextToElement(_firstNameField, firstname);
    }
    // method to enter last name field
    public void enterLastName(String lastname) {
        Reporter.log("Enter last name" + lastname + " to last name field " + _lastNameField.toString() + "<br>");
        log.info("Enter last name" + lastname + " to last name field " + _lastNameField.toString());
        sendTextToElement(_lastNameField, lastname);
    }
    // method to enter day to birthday field
    public void enterDay(String day) {
        Reporter.log("Enter Day" + _dayField.toString() + "<br>");
        log.info("Enter Day" + _dayField.toString());
        sendTextToElement(_dayField, day);
    }
    // method to enter month to birthday field
    public void enterMonth(String month) {
        Reporter.log("Enter Month" + _monthField.toString() + "<br>");
        log.info("Enter Month" + _monthField.toString());
        sendTextToElement(_monthField, month);
    }
    // method to enter day to birthday field
    public void enterYear(String year) {
        Reporter.log("Enter Year" + _yearField.toString() + "<br>");
        log.info("Enter Year" + _yearField.toString());
        sendTextToElement(_yearField, year);
    }
    //method to enter email field
    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + "to email field " + _emailField.toString() + "<br>");
        log.info("Enter email " + email + "to email field " + _emailField.toString());
        sendTextToElement(_emailField, email);
    }
    //method to enter company name
    public void enterCompanyName(String company){
        Reporter.log("Enter company name" + company + "to company field" + _companyField.toString() + "<br>");
        log.info("Enter company name" + company + "to company field" + _companyField.toString());
        sendTextToElement(_companyField,company);
    }
    //method to tick checkbox
    public void clickOnNewsLetter(){
        Reporter.log("Click on NewsLetter checkbox" + _newsLetterCheckbox.toString() + "<br>");
        log.info("Click on NewsLetter checkbox" + _newsLetterCheckbox.toString());
        clickOnElement(_newsLetterCheckbox);
    }
    //method to enter password to password field
    public void enterPassword(String password) {
        Reporter.log("password email " + password + "to password field " + _passwordField.toString() + "<br>");
        log.info("password email " + password + "to password field " + _passwordField.toString());
        sendTextToElement(_passwordField,password);
    }
    //method to enter confirm password to field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Enter confirm password " + confirmPassword + "to confirm password field " + _confirmPasswordField.toString() + "<br>");
        log.info("Enter confirm password " + confirmPassword + "to confirm password field " + _confirmPasswordField.toString());
        sendTextToElement(_confirmPasswordField,confirmPassword);
    }
    //method to click on register button
    public void clickOnRegisterButton(){
        Reporter.log( "Click ON register button" + _registerButton.toString() + "<br>");
        log.info("Click ON register button" + _registerButton.toString());
        clickOnElement(_registerButton);
    }
    //method to verify Your registration completed text
    public String getYourRegistrationCompleted(){
        return getTextFromElement(_yourRegistrationCompleted);
    }


}


