package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class WidgetsPage extends BasePage {

    private By mainTitle = By.className("main-header");

    public WidgetsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public String getWidgetsPageURL(){
        return getDriver().getCurrentUrl();
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }
}