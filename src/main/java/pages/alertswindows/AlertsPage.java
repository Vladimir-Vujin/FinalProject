package pages.alertswindows;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class AlertsPage extends BasePage {

    private By mainTitle = By.className("main-header");
    private By labelMassage = By.id("confirmResult");
    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By promptAlertButton = By.id("promtButton");
    private By promptLabelMessage = By.id("promptResult");

    public AlertsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public WebElement getLabelMessage() {
        return getDriver().findElement(labelMassage);
    }

    public WebElement getAlertButton() {
        return getDriver().findElement(alertButton);
    }

    public WebElement getTimerAlertButton() {
        return getDriver().findElement(timerAlertButton);
    }

    public WebElement getConfirmAlertButton() {
        return getDriver().findElement(confirmAlertButton);
    }

    public WebElement getPromptAlertButton() {
        return getDriver().findElement(promptAlertButton);
    }

    public WebElement getPromptLabelMessage() {
        return getDriver().findElement(promptLabelMessage);
    }

    public String getAlertsPageURL(){
        return getDriver().getCurrentUrl();
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }

    public String labelMessageText(){
        return getLabelMessage().getText();
    }

    public String promptLabelMessageText(){
        return getPromptLabelMessage().getText();
    }

    public void clickAlertButton() {
        getAlertButton().click();
        waitAlertToPresent();
    }
    public void clickTimerAlertButton() {
        getTimerAlertButton().click();
        waitAlertToPresent();
    }

    public void clickConfirmAlertButton() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", getConfirmAlertButton());
        waitAlertToPresent();
    }

    public void clickPromptAlertButton() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", getPromptAlertButton());
        waitAlertToPresent();
    }

    public void waitAlertToPresent(){
        getDriverWait().until(ExpectedConditions.alertIsPresent());
    }
}
