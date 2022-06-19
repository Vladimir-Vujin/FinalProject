package pages.defaultpages;

import lombok.Getter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private static final String HOME_URL = "https://demoqa.com/";
    private static final String ELEMENTS_URL = "https://demoqa.com/elements";
    private static final String LOGIN_URL = "https://demoqa.com/login";

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    public void javaScriptScroll() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
    }

    public void openHomePage() {
        driver.navigate().to(HOME_URL);
    }

    public void openElementsPage() {
        driver.navigate().to(ELEMENTS_URL);
    }

    public void openLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

}
