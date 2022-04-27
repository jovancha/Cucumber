package com.cucumbertest.cucumber.runConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RunConfiguration {

    @Value("${myDefaultBrowser}")
    private String defaultBrowser;

    @Value("${mySecondBrowser}")
    private String secondBrowser;

    public RunConfiguration() {
    }

    public String getDefaultBrowser() {
        return defaultBrowser;
    }

    public String getSecondBrowser() {
        return secondBrowser;
    }

}
