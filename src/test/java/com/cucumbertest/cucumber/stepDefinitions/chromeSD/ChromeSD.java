package com.cucumbertest.cucumber.stepDefinitions.chromeSD;

import com.cucumbertest.cucumber.runConfiguration.RunConfiguration;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.baseURI;

public class ChromeSD {
    @Autowired
    RunConfiguration runConfiguration;

    String chromeURI;

    @Before
    public void setUp() {
        this.chromeURI = runConfiguration.getSecondBrowser();
    }

    @When("chrome variable is stored into appprop show it")
    public void showChromeURI() {
        baseURI = chromeURI;
        System.out.println("***************************************************************");
        System.out.println("This is chrome URI from application properties: " + baseURI);
    }
}
