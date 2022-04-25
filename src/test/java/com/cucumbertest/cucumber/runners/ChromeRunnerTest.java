package com.cucumbertest.cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featureFiles/chromeFF",
        glue = {"com/cucumbertest/cucumber/stepDefinitions/chromeSD","com/cucumbertest/cucumber/cucumberConfig"},
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false
)
public class ChromeRunnerTest {
}
