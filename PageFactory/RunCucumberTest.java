package com.mavenit.selenium1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/com/mavenit/selenium1" +
        "/FeatureFileResources/LoginPageFeauture.feature")

       //,glue = {"src/test/java/com/mavenit/selenium1/stepDefinition"})


public class RunCucumberTest {
}



