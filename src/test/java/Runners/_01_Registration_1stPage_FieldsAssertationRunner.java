package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(features = {"src/test/java/FeatureFiles/_01_Registration_1stPage_FieldsAssertation.feature"},
            glue = {"StepDefinitions"})

    public class _01_Registration_1stPage_FieldsAssertationRunner extends AbstractTestNGCucumberTests {
    }

