package com.salesforce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='rememberUn']")
    private WebElement rememberMeCheckbox;

    @FindBy(xpath = "//div[@id='error']")
    private WebElement errorMessage;

    @FindBy(xpath = "//a[@id='forgot_password_link']")
    private WebElement forgotPasswordLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        try {
            wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();
        } catch (Exception e) {
            throw new RuntimeException("Failed to perform login: " + e.getMessage(), e);
        }
    }

    public void enterUsername(String username) {
        try {
            wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter username: " + e.getMessage(), e);
        }
    }

    public void enterPassword(String password) {
        try {
            wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter password: " + e.getMessage(), e);
        }
    }

    public void clickLoginButton() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        } catch (Exception e) {
            throw new RuntimeException("Failed to click login button: " + e.getMessage(), e);
        }
    }

    public String getErrorMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOf(errorMessage));
            return errorMessage.getText();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve error message: " + e.getMessage(), e);
        }
    }

    public boolean isErrorDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void checkRememberMe() {
        try {
            if (!rememberMeCheckbox.isSelected()) {
                rememberMeCheckbox.click();
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to interact with remember me checkbox: " + e.getMessage(), e);
        }
    }

    public boolean isRememberMeSelected() {
        try {
            return rememberMeCheckbox.isSelected();
        } catch (Exception e) {
            throw new RuntimeException("Failed to check remember me state: " + e.getMessage(), e);
        }
    }

    public String getPageTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new RuntimeException("Failed to get page title: " + e.getMessage(), e);
        }
    }

    public String getCurrentUrl() {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            throw new RuntimeException("Failed to get current URL: " + e.getMessage(), e);
        }
    }

    public void navigateToLoginPage() {
        try {
            driver.get("https://login.salesforce.com/?locale=in");
            wait.until(ExpectedConditions.visibilityOf(usernameField));
        } catch (Exception e) {
            throw new RuntimeException("Failed to navigate to login page: " + e.getMessage(), e);
        }
    }

    public boolean isLoginButtonDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(loginButton)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isForgotPasswordLinkDisplayed() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(forgotPasswordLink)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clearUsernameField() {
        try {
            wait.until(ExpectedConditions.visibilityOf(usernameField)).clear();
        } catch (Exception e) {
            throw new RuntimeException("Failed to clear username field: " + e.getMessage(), e);
        }
    }

    public void clearPasswordField() {
        try {
            wait.until(ExpectedConditions.visibilityOf(passwordField)).clear();
        } catch (Exception e) {
            throw new RuntimeException("Failed to clear password field: " + e.getMessage(), e);
        }
    }

    public void closeDriver() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to close driver: " + e.getMessage(), e);
        }
    }
}
