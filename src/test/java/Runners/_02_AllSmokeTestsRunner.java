package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"})

public class _02_AllSmokeTestsRunner extends AbstractTestNGCucumberTests {
}

