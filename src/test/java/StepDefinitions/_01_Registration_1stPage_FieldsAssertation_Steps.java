package StepDefinitions;

import Utilities.WDrivers;
import io.cucumber.java.en.*;

public class _01_Registration_1stPage_FieldsAssertation_Steps {

    @Given("potential online casino player navigates to registration page of Wildz")
    public void potential_online_casino_player_navigates_registration_page_of_wildz() {
        WDrivers.getDriver().get("https://www.wildz.com/en/register/");
    }

    @When("clicking on Register button.")
    public void clicking_on_register_button() {

    }

    @Then("potential user should be able to click and fill email, phone number fields and select country code.")
    public void potential_user_should_be_able_to_click_and_fill_email_phone_number_fields_and_select_country_code() {

    }

}
