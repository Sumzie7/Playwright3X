package com.salesforce.tests;

import com.salesforce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void testInvalidUsernameShowsError() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.doLogin("invalid@wrong.com", "SomePassword123");
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed for invalid username");
            String errorText = loginPage.getErrorMessage();
            Assert.assertFalse(errorText.isEmpty(), "Error message text is empty");
        } catch (Exception e) {
            Assert.fail("Invalid username test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testInvalidPasswordShowsError() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.doLogin("suman@example.com", "WrongPassword999");
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed for invalid password");
            String errorText = loginPage.getErrorMessage();
            Assert.assertFalse(errorText.isEmpty(), "Error message text is empty");
        } catch (Exception e) {
            Assert.fail("Invalid password test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testBlankCredentialsShowsError() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.doLogin("", "");
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed for blank credentials");
            String errorText = loginPage.getErrorMessage();
            Assert.assertFalse(errorText.isEmpty(), "Error message text is empty for blank credentials");
        } catch (Exception e) {
            Assert.fail("Blank credentials test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testBlankUsernameShowsError() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.enterUsername("");
            loginPage.enterPassword("ValidPassword123");
            loginPage.clickLoginButton();
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed for blank username");
        } catch (Exception e) {
            Assert.fail("Blank username test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testBlankPasswordShowsError() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.enterUsername("suman@example.com");
            loginPage.enterPassword("");
            loginPage.clickLoginButton();
            Assert.assertTrue(loginPage.isErrorDisplayed(), "Error message not displayed for blank password");
        } catch (Exception e) {
            Assert.fail("Blank password test failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testUserStaysOnLoginPageAfterInvalidLogin() {
        try {
            loginPage.navigateToLoginPage();
            loginPage.doLogin("invalid@wrong.com", "BadPass456");
            String currentUrl = loginPage.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("login.salesforce.com"),
                    "User was redirected away from login page after invalid credentials. URL: " + currentUrl);
            Assert.assertTrue(loginPage.isLoginButtonDisplayed(), "Login button not present after failed login");
        } catch (Exception e) {
            Assert.fail("Stay on login page test failed with exception: " + e.getMessage());
        }
    }
}
