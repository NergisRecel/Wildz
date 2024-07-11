package Pages;

import Utilities.WDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Registration_Content extends Parent {

    public Registration_Content() {
        PageFactory.initElements(WDrivers.getDriver(), this);
    }

  //  @FindBy(xpath = "(//button[text()='Register'])")
    @FindBy(xpath = "//div[@class='bottombar__right']//button[3]")
    public WebElement registrationButton;

    @FindBy(css = "input[name='username']")
    public WebElement username;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "select[name='phone-prefix']")
    public WebElement countryCode;

    @FindBy(css = "option[data-key='MT']")
    public WebElement malta;

    @FindBy(css = "input[name='phone-suffix']")
    public WebElement phoneNumber;


}
