package com.automation.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//AddDeleteUser.feature",
        glue = "com.automation.steps",
        //tags = "@Smoke",
        plugin = {"pretty","html:target/index.html", "json:target/cucumber.json"}
)

public class TestRunner {
}
