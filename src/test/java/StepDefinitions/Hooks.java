package StepDefinitions;

import Utilities.WDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(Scenario scenario){


        if(scenario.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) WDrivers.getDriver());
            byte[] inmemory=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(inmemory, "image/png", "screenshot name");

        }
        WDrivers.quitDriver();

    }}


