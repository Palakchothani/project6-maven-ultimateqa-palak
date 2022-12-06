package com.ultimateqa.testsuite;

import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void verifyTheErrorMessage() {
        loginPage.navigatedToLoginPage();

        // email
        loginPage.userName("palak123@gmail.com");

        // passcode
        loginPage.passwordField("Palak123");

        //Click on login button
        loginPage.setSignInButton();


        //verify Invalid email or password occur
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.messageOccur(), expectedMessage, "Message not displayed");


        // Verify Welcome Text Button
        String expectedMessage1 = "Welcome Back!";
        Assert.assertEquals(loginPage.Message(), expectedMessage1, "Message not displayed");

    }
}