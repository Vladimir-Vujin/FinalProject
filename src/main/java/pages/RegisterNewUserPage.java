package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterNewUser extends BasePage {

    private By firstNameInputBox = By.id("firstname");
    private By lastNameInputBox = By.id("lastname");
    private By userNameInputBox = By.id("userName");
    private By passwordInputBox = By.id("password");
    private By captcha = By.className("recaptcha-checkbox-border");
    private By registerButton = By.id("register");

    public RegisterNewUser(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


}
