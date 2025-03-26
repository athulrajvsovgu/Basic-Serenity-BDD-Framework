package com.example.core;

import net.serenitybdd.core.pages.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {
    
    /**
     * Waits for an element to be visible
     * 
     * @param element The WebElement to wait for
     */
    public void waitForElement(WebElement element) {
    	waitForCondition().withTimeout(Duration.ofSeconds(10));
    }
    
    /**
     * Types text into a field after waiting for it
     * 
     * @param element The WebElement to type into
     * @param text The text to type
     */
    public void typeInto(WebElement element, String text) {
        waitForElement(element);
        element.clear();
        element.sendKeys(text);
    }
    
    /**
     * Clicks on an element after waiting for it
     * 
     * @param element The WebElement to click
     */
    public void clickOn(WebElement element) {
        waitForElement(element);
        element.click();
    }
    
    /**
     * Gets text from an element after waiting for it
     * 
     * @param element The WebElement to get text from
     * @return The text content of the element
     */
    protected String getTextFrom(WebElement element) {
        waitForElement(element);
        return element.getText();
    }
}
