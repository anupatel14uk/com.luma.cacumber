package com.luma.cacumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resource/featurefile",
        glue = "com/luma/cacumber",
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class RegressionTestRunner {

}
