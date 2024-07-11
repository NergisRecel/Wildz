Feature:Registration Functionality

  @SmokeTest @RegressionTest @RegistrationTest
  Scenario: User should be able to click and fill necessary fields and select from the drop down menu
    Given potential online casino player navigates to registration page of Wildz
    When clicking on Register button.
    Then potential user should be able to click and fill email, phone number fields and select country code.
