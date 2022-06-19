package pages.alertswindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class ModalDialogsPage extends BasePage {

    private By smallModalButton = By.id("showSmallModal");
    private By largeModalButton = By.id("showLargeModal");
    private By modalDialog = By.className("modal-dialog");
    private By modalBody = By.className("modal-body");
    private By closeSmallModalButton = By.id("closeSmallModal");
    private By closeLargeModalButton = By.id("closeLargeModal");

    public ModalDialogsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getSmallModalButton(){
        return getDriver().findElement(smallModalButton);
    }

    public WebElement getLargeModalButton(){
        return getDriver().findElement(largeModalButton);
    }

    public WebElement getModalDialog(){
        return getDriver().findElement(modalDialog);
    }

    public WebElement getCloseSmallModalButton(){
        return getDriver().findElement(closeSmallModalButton);
    }

    public WebElement getCloseLargeModalButton(){
        return getDriver().findElement(closeLargeModalButton);
    }

    public WebElement getModalBody(){
        return getDriver().findElement(modalBody);
    }

    public void clickSmallModalButton() {
        getSmallModalButton().click();
    }

    public void clickLargeModalButton(){
        getLargeModalButton().click();
    }

    public String modalBodyText(){
        return getModalBody().getText();
    }

    public void clickCloseSmallModalButton(){
        getCloseSmallModalButton().click();
    }

    public void clickCloseLargeModalButton(){
        getCloseLargeModalButton().click();
    }
}
