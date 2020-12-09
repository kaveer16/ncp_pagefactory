package com.nopcommerce.demo.nopcommercetest;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
   HomePage homePage = new HomePage();
   LoginPage loginPage =new LoginPage();

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNotLoginSuccessfullyWithValidCredentials() {

        homePage.clickOnLoginLink();

        loginPage.enterEmailId("abcd@yahoo.com",5);

        loginPage.enterPassword("pass133",5);

        loginPage.clickOnLoginButton();

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

