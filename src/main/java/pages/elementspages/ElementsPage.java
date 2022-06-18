package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class ElementsPage extends BasePage {

    private By mainTitle = By.className("main-header");
    private By elementTextBox = By.id("item-0");
    private By elementCheckBox = By.id("item-1");
    private By elementRadioButton = By.id("item-2");
    private By elementWebTables = By.id("item-3");
    private By elementButtons = By.id("item-4");
    private By elementLinks = By.id("item-5");

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

    public WebElement getElementRadioButton(){
        return getDriver().findElement(elementRadioButton);
    }

    public WebElement getElementWebTables(){
        return getDriver().findElement(elementWebTables);
    }

    public WebElement getElementButtons(){
        return getDriver().findElement(elementButtons);
    }

    public WebElement getElementLinks() {return getDriver().findElement(elementLinks);}

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

    public void clickElementRadioButton(){
        getElementRadioButton().click();
    }

    public void clickElementWebTables(){
        getElementWebTables().click();
    }

    public void clickElementButtons(){
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        //jsExecutor.executeScript("window.scrollBy(0,500)");
        javaScriptScroll();
        getElementButtons().click();
    }

    public void clickElementLinks(){
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        //jsExecutor.executeScript("window.scrollBy(0,500)");
        javaScriptScroll();
        getElementLinks().click();
    }


}
