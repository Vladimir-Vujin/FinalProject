package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class ButtonsPage extends BasePage {

    private By doubleClickButton = By.id("doubleClickBtn");
    private By rightClickButton = By.id("rightClickBtn");
    private By clickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    private By doubleClickMessage = By.id("doubleClickMessage");
    private By rightClickMessage = By.id("rightClickMessage");
    private By clickMessage = By.id("dynamicClickMessage");

    Actions action =  new Actions(getDriver());

    public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getDoubleClickButton(){
        return getDriver().findElement(doubleClickButton);
    }

    public WebElement getRightClickButton(){
        return getDriver().findElement(rightClickButton);
    }

    public WebElement getClickButton(){
        return getDriver().findElement(clickButton);
    }

    public WebElement getDoubleClickMessage(){
        return getDriver().findElement(doubleClickMessage);
    }

    public WebElement getRightClickMessage(){
        return getDriver().findElement(rightClickMessage);
    }

    public WebElement getClickMessage(){
        return getDriver().findElement(clickMessage);
    }

    public void clickDoubleClickButton(){
        action.moveToElement(getDoubleClickButton()).doubleClick().perform();
    }

    public void clickRightClickButton(){
        action.contextClick(getRightClickButton()).perform();
    }

    public void clickClickButton(){
        action.moveToElement(getClickButton()).click().perform();
    }

    public boolean isVisibleDoubleClickMessage(){
        return getDoubleClickMessage().isDisplayed();
    }

    public String doubleClickMessageText(){
        return getDoubleClickMessage().getText();
    }

    public boolean isVisibleRightClickMessage(){
        return getRightClickMessage().isDisplayed();
    }

    public String rightClickMessageText(){
        return getRightClickMessage().getText();
    }

    public boolean isVisibleClickMessage(){
        return getClickMessage().isDisplayed();
    }

    public String clickMessageText(){
        return getClickMessage().getText();
    }
}
