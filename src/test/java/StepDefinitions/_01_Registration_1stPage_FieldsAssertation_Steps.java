package StepDefinitions;

import Pages.Registration_Content;
import Utilities.WDrivers;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;
import java.util.List;

public class _01_Registration_1stPage_FieldsAssertation_Steps {

    Registration_Content rc = new Registration_Content();
    JavascriptExecutor js = (JavascriptExecutor) WDrivers.getDriver();

    @Given("potential online casino player navigates to Wildz")
    public void potential_online_casino_player_navigates_to_wildz() {
        WDrivers.getDriver().get("https://www.wildz.com/en/");
    }

    @When("clicking on Register button.")
    public void clicking_on_register_button() {

        WebDriverWait wait = new WebDriverWait(WDrivers.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='Allow all Cookies'])")));
        List<WebElement> cookiesAccept = WDrivers.getDriver().findElements(By.xpath("(//button[text()='Allow all Cookies'])"));
        if (cookiesAccept.size() > 0) {
            cookiesAccept.get(0).click();
        }

        // using javascript to be able to click register button
        js.executeScript("arguments[0].scrollIntoView(true);", rc.registrationButton);
        js.executeScript("arguments[0].click();", rc.registrationButton);


    }

    @Then("potential user should be able to click and fill email, phone number fields and select country code.")
    public void potential_user_should_be_able_to_click_and_fill_email_phone_number_fields_and_select_country_code() {
        rc.myClick(rc.username);
        rc.mysendKeys(rc.username,"testmail@wildz.com");
        rc.myClick(rc.password);
        rc.mysendKeys(rc.password,"wildZ123!");
        js.executeScript("arguments[0].scrollIntoView(true);", rc.countryCode);
        js.executeScript("arguments[0].click();", rc.countryCode);
        rc.myClick(rc.malta);
        rc.myClick(rc.phoneNumber);
        rc.mysendKeys(rc.phoneNumber,"99934239");
        Assert.assertTrue(rc.username.isDisplayed(),"Email field is displayed.");
        Assert.assertTrue(rc.password.isDisplayed(),"Password field is displayed.");
        Assert.assertTrue(rc.countryCode.isEnabled(),"Country code field is enabled.");
        Assert.assertTrue(rc.phoneNumber.isDisplayed(),"Phone number field is displayed.");




    }

}
