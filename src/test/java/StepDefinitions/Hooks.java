package StepDefinitions;

import Utilities.WDrivers;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void after(){

        WDrivers.quitDriver();

    }

}
