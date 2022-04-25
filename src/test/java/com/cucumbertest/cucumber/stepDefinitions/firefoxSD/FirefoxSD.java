package com.cucumbertest.cucumber.stepDefinitions.firefoxSD;

import com.cucumbertest.cucumber.runConfiguration.RunConfiguration;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static io.restassured.RestAssured.baseURI;

public class FirefoxSD {

    @Autowired
    RunConfiguration runConfiguration;

    String fireFoxURI;

    @Before
    public void setUp() {
        this.fireFoxURI = runConfiguration.getDefaultBrowser();
    }

    @When("firefox variable is stored into appprop show it")
    public void showFirefoxURI() {
        baseURI = fireFoxURI;
        System.out.println("***************************************************************");
        System.out.println("This is firefox URI from application properties: " + baseURI);
    }
}
