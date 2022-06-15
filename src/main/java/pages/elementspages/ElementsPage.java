package pages.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class ElementsPage extends BasePage {

    private By mainTitle = By.className("main-header");
    private By elementTextBox = By.id("item-0");
    private By elementCheckBox = By.id("item-1");

    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public WebElement getElementTextBox(){
        return getDriver().findElement(elementTextBox);
    }

    public WebElement getElementCheckBox(){
        return getDriver().findElement(elementCheckBox);
    }

    public String getElementPageURL(){
        return getDriver().getCurrentUrl();
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }

    public void clickElementTextBox(){
        getElementTextBox().click();
    }

    public void clickElementCheckBox(){
        getElementCheckBox().click();
    }

}
