package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

public class FormsPage extends BasePage {

    private By mainTitle = By.className("main-header");

    public FormsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }
}
