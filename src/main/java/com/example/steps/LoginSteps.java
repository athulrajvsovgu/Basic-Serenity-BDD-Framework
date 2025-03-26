package com.example.steps;

import com.example.pages.LoginPage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends UIInteractionSteps {
    
    private LoginPage loginPage;
    
    @Step("Open the login page")
    public void openLoginPage() {
        loginPage.open();
    }
    
    @Step("Enter username '{0}'")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }
    
    @Step("Enter password '{0}'")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }
    
    @Step("Click the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    
    @Step("Login with username '{0}' and password '{1}'")
    public void loginAsUser(String username, String password) {
        openLoginPage();
        loginPage.loginAsUser(username, password);
    }
    
    @Step("Get error message")
    public String getErrorMessage() {
        return loginPage.getErrorMessage();
    }
}
