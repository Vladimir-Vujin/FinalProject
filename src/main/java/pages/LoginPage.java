package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class LoginPage extends BasePage {


    private By userNameInputBox = By.id("userName");
    private By passwordInputBox = By.id("password");
    private By loginButton = By.id("login");
    private By newUserButton = By.id("newUser");

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getUserNameInputBox() {
        return getDriver().findElement(userNameInputBox);
    }

    public WebElement getPasswordInputBox() {
        return getDriver().findElement(passwordInputBox);
    }

    public WebElement getLoginButton() {
        return getDriver().findElement(loginButton);
    }

    public WebElement getNewUserButton() {
        return getDriver().findElement(newUserButton);
    }

    public void inputUserName(String userName) {
        getUserNameInputBox().sendKeys(userName);
    }

    public void inputPassword(String password) {
        getPasswordInputBox().sendKeys(password);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    public void clickNewUserButton() {
        getNewUserButton().click();
    }

    public void fillLoginForm(String userName, String password) {
        inputUserName(userName);
        inputPassword(password);
        clickLoginButton();
    }

}
