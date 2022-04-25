package com.cucumbertest.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/firefoxFF",
        glue ={"com/cucumbertest/cucumber/stepDefinitions/firefoxSD","com/cucumbertest/cucumber/cucumberConfig"},
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false
)
public class FireFoxRunnerTest {
}
