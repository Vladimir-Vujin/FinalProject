package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class RegisterNewUserPage extends BasePage {

    // recaptcha-checkbox-unchecked
    //  recaptcha-checkbox-checked
    private By firstNameInputBox = By.id("firstname");
    private By lastNameInputBox = By.id("lastname");
    private By userNameInputBox = By.id("userName");
    private By passwordInputBox = By.id("password");
    private By captcha= By.id("recaptcha-anchor-label");
    //private By captcha = By.id("rc-anchor-container");
   // private By captcha = By.className("recaptcha-checkbox-border");
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

    public WebElement getCaptcha(){
        return getDriver().findElement(captcha);
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

    public void clickCaptcha() {
        getCaptcha().click();
    }

    public void clickRegisterButton() {
        getRegisterButton().click();
    }

    public void fillRegisterForm(String firstName, String lastName, String userName, String password) {



       /* inputFirstName(firstName);
        inputLastName(lastName);
        inputUserName(userName);
        inputPassword(password);*/
        //clickCaptcha();

        getDriverWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-')]")));
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click().perform();

        //action.moveToElement(getFirstNameInputBox()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-')]")));
        //getDriverWait().until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
        action.moveToElement(getRegisterButton()).click();
        //clickRegisterButton();
    }
}
