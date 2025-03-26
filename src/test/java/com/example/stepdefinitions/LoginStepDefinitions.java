package com.example.stepdefinitions;

import com.example.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepDefinitions {
    
    @Steps
    private LoginSteps loginSteps;
    
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginSteps.openLoginPage();
    }
    
    @When("the user enters username {string} and password {string}")
    public void theUserEntersUsernameAndPassword(String username, String password) {
        loginSteps.enterUsername(username);
        loginSteps.enterPassword(password);
    }
    
    @When("the user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginSteps.clickLoginButton();
    }
    
    @Then("the user should see an error message containing {string}")
    public void theUserShouldSeeAnErrorMessageContaining(String errorText) {
        String actualError = loginSteps.getErrorMessage();
        Assert.assertTrue("Error message does not contain expected text: " + errorText,
                actualError.contains(errorText));
    }
}