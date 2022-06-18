package pages.alertswindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

import java.util.Set;

public class BrowserWindowsPage extends BasePage {

    private By tabButton = By.id("tabButton");
    private By windowButton = By.id("windowButton");
    private By messageWindowButton = By.id("messageWindowButton");

    public BrowserWindowsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getTabButton(){
        return getDriver().findElement(tabButton);
    }

    public WebElement getWindowButton(){
        return getDriver().findElement(windowButton);
    }

    public WebElement getMessageWindowButton(){
        return getDriver().findElement(messageWindowButton);
    }

    public void clickTabButton(){
        getTabButton().click();
    }

    public void clickWindowButton(){
        getWindowButton().click();
    }

    public void clickMessageWindowButton(){
        getMessageWindowButton().click();
    }

    public String getURLOfNewTab(){
        String currentTab = getDriver().getWindowHandle();
        getDriverWait().until(ExpectedConditions.numberOfWindowsToBe(2));

        for(String windowHandle: getDriver().getWindowHandles()) {
            if(!windowHandle.equalsIgnoreCase(currentTab)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
        return getDriver().getCurrentUrl();
    }
}
