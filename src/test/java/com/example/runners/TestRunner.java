package com.example.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.stepdefinitions", "com.example.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        tags = "@web"
)
public class TestRunner {
}
