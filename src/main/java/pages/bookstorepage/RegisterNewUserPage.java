package pages.bookstorepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

import java.util.Iterator;
import java.util.Set;

public class RegisterNewUserPage extends BasePage {

    private By firstNameInputBox = By.id("firstname");
    private By lastNameInputBox = By.id("lastname");
    private By userNameInputBox = By.id("userName");
    private By passwordInputBox = By.id("password");
    private By registerButton = By.id("register");

    public RegisterNewUserPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFirstNameInputBox(){
        return getDriver().findElement(firstNameInputBox);
    }

    public WebElement getLastNameInputBox(){
        return getDriver().findElement(lastNameInputBox);
    }

    public WebElement getUserNameInputBox() {
        return getDriver().findElement(userNameInputBox);
    }

    public WebElement getPasswordInputBox(){
        return getDriver().findElement(passwordInputBox);
    }

    public WebElement getRegisterButton(){
        return getDriver().findElement(registerButton);
    }

    public void inputFirstName(String firstName) {
        getFirstNameInputBox().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastNameInputBox().sendKeys(lastName);
    }

    public void inputUserName(String userName) {
        getUserNameInputBox().sendKeys(userName);
    }

    public void inputPassword(String password) {
        getPasswordInputBox().sendKeys(password);
    }

    public void clickRegisterButton() {
        getRegisterButton().click();
    }

    public void fillRegisterForm(String firstName, String lastName, String userName, String password) {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");

        inputFirstName(firstName);
        inputLastName(lastName);
        inputUserName(userName);
        inputPassword(password);

        String mainWindow = getDriver().getWindowHandle();

        getDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

        getDriverWait().until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

        getDriver().switchTo().window(mainWindow);

       try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickRegisterButton();
    }
}
