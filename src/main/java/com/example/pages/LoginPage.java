package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import com.example.core.BasePage;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends BasePage {
    
    @FindBy(id = "user-name")
    private WebElement usernameField;
    
    @FindBy(id = "password")
    private WebElement passwordField;
    
    @FindBy(id = "login-button")
    private WebElement loginButton;
    
    @FindBy(css = ".error-message-container.error")
    private WebElement errorMessage;
    
    /**
     * Enters username in the username field
     * 
     * @param username The username to enter
     */
    public void enterUsername(String username) {
        typeInto(usernameField, username);
    }
    
    /**
     * Enters password in the password field
     * 
     * @param password The password to enter
     */
    public void enterPassword(String password) {
        typeInto(passwordField, password);
    }
    
    /**
     * Clicks the login button
     */
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    
    /**
     * Gets the error message text
     * 
     * @return The error message text
     */
    public String getErrorMessage() {
        return getTextFrom(errorMessage);
    }
    
    /**
     * Combines login steps into a single method
     * 
     * @param username The username to enter
     * @param password The password to enter
     */
    public void loginAsUser(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
