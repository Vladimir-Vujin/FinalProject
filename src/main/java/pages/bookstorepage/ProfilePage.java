package pages.bookstorepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class ProfilePage extends BasePage {

    private By userNameLabel = By.id("userName-value");
    private By deleteAccountButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button");
    private By confirmDeleteButtonOnModal = By.id("closeSmallModal-ok");

    public ProfilePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getUserNameLabel() {
        return getDriver().findElement(userNameLabel);
    }

    public WebElement getDeleteAccountButton(){
        return getDriver().findElement(deleteAccountButton);
    }

    public WebElement getConfirmDeleteButtonOnModal(){
        return getDriver().findElement(confirmDeleteButtonOnModal);
    }

    public String userNameLabelText(){
        return getUserNameLabel().getText();
    }

    public void clickDeleteAccountButton(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getDeleteAccountButton().click();
    }

    public void clickConfirmDeleteButtonOnModal(){
        getConfirmDeleteButtonOnModal().click();
    }
}
