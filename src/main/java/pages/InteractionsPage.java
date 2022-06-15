package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class InteractionsPage extends BasePage {

    private By mainTitle = By.className("main-header");

    public InteractionsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public String getInteractionsPageURL(){
        return getDriver().getCurrentUrl();
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }


}
