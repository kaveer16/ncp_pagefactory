package com.nopcommerce.demo.nopcommercetest;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void setUp() {
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
    }

        @Test(groups = {"sanity","smoke"})
        public void verifyUserShouldRegisterSuccessfully () {
            homePage.clickOnRegisterLink();
            registrationPage.choosingMaleOption();

            registrationPage.enterFirstName("Kaveer");

            registrationPage.enterLastName("Kumar");

            registrationPage.enterDay("10");

            registrationPage.enterMonth("October");

            registrationPage.enterYear("1985");

            int num = getRandomNumeric();
            registrationPage.enterEmailId("kaveer" + num + "gmail.com");

            registrationPage.enterCompanyName("Raj Consultants");

            registrationPage.clickOnNewsLetter();

            registrationPage.enterPassword("123456");

            registrationPage.enterConfirmPassword("123456");

            registrationPage.clickOnRegisterButton();

            registrationPage.getYourRegistrationCompleted();
            String expectedMessage = "Your registration completed";
            String actualMessage = registrationPage.getYourRegistrationCompleted();
            Assert.assertEquals(expectedMessage, actualMessage);

        }
    }

