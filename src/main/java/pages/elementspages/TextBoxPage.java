package pages.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class TextBoxPage extends BasePage {

    private By fullNameTextBox = By.id("userName");
    private By emailTextBox = By.id("userEmail");
    private By currentAddressTextBox = By.id("currentAddress");
    private By permanentAddressTextBox = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    //private By submitButton = By.xpath("//*[@id=\"submit\"]");

    private By frameTextBox = By.id("output");
    private By nameLabel = By.id("name");
    private By emailLabel = By.id("email");
    private By currentAddressLabel = By.id("currentAddress");
    private By permanentAddressLabel = By.id("permanentAddress");

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFullNameTextBox(){
        return getDriver().findElement(fullNameTextBox);
    }

    public void inputFullNameTextBox(String fullName){
        getFullNameTextBox().sendKeys(fullName);
    }

    public WebElement getEmailTextBox(){
        return getDriver().findElement(emailTextBox);
    }

    public void inputEmailTextBox(String email) {
        getEmailTextBox().sendKeys(email);
    }

    public WebElement getCurrentAddressTextBox(){
        return getDriver().findElement(currentAddressTextBox);
    }

    public void inputCurrentAddressTextBox(String currentAddress){
        getCurrentAddressTextBox().sendKeys(currentAddress);
    }

    public WebElement getPermanentAddressTextBox(){
        return getDriver().findElement(permanentAddressTextBox);
    }

    public void inputPermanentAddressTextBox(String permanentAddress){
        getPermanentAddressTextBox().sendKeys(permanentAddress);
    }

    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }

    public void clickSubmitButton(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getSubmitButton().click();
    }

    public void fillAllTextBoxes(String fullName, String email, String currentAddress, String permanentAddress){
        inputFullNameTextBox(fullName);
        inputEmailTextBox(email);
        inputCurrentAddressTextBox(currentAddress);
        inputPermanentAddressTextBox(permanentAddress);
        clickSubmitButton();
    }

    public boolean isFrameVisible(){
        return getDriver().findElement(frameTextBox).isDisplayed();
    }




}
