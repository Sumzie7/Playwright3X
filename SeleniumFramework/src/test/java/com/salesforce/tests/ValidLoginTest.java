package com.salesforce.tests;

import com.salesforce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testValidLoginRedirectsToHomePage() {
        try {
            loginPage.navigateToLoginPage();
            Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login page did not load properly");
            Assert.assertTrue(loginPage.isForgotPasswordLinkDisplayed(), "Forgot password link not displayed");
            loginPage.doLogin("suman@example.com", "ValidPassword123");
            String currentUrl = loginPage.getCurrentUrl();
            Assert.assertFalse(currentUrl.contains("login.salesforce.com"),
                    "Login failed - still on login page after valid credentials. URL: " + currentUrl);
        } catch (Exception e) {
            Assert.fail("Valid login test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testLoginWithRememberMe() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.enterUsername("suman@example.com");
            loginPage.enterPassword("ValidPassword123");
            loginPage.checkRememberMe();
            Assert.assertTrue(loginPage.isRememberMeSelected(), "Remember me checkbox is not selected");
            loginPage.clickLoginButton();
            String currentUrl = loginPage.getCurrentUrl();
            Assert.assertFalse(currentUrl.contains("login.salesforce.com"),
                    "Login with remember me failed. URL: " + currentUrl);
        } catch (Exception e) {
            Assert.fail("Login with remember me test failed with exception: " + e.getMessage());
        }
    }
}
