package com.cucumbertest.cucumber.cucumberConfig;

import com.cucumbertest.cucumber.CucumberApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberApplication.class)
public class CucumberConfig {
}
