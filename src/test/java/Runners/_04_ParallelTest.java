package Runners;

import Utilities.WDrivers;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(tags = "@RegistrationTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
  plugin =  {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class _04_ParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browserType")
    public void beforeclass(String browserName) {
        WDrivers.threadBrowserName.set(browserName);
    }

}