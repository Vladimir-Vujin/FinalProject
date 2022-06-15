package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class BookStorePage extends BasePage {

    private By mainTitle = By.className("main-header");
    private By loginButton = By.id("login");

    public BookStorePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getMainTitle() {
        return getDriver().findElement(mainTitle);
    }

    public WebElement getLoginButton() {
        return getDriver().findElement(loginButton);
    }

    public String getBookstorePageURL(){
        return getDriver().getCurrentUrl();
    }

    public String mainTitleGetText() {
        return getMainTitle().getText();
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }
}
