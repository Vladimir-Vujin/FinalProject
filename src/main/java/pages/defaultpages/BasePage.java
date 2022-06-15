package pages.defaultpages;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

    private WebDriver driver;
    private WebDriverWait driverWait;

    private static final String HOME_URL = "https://demoqa.com/";
    private static final String ELEMENTS_URL = "https://demoqa.com/elements";

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;
    }

    //public WebDriver getDriver() {
    //    return driver;
    //}

    //public void setDriver(WebDriver driver) {
    //    this.driver = driver;
    //}

    //public WebDriverWait getDriverWait() {
    //    return driverWait;
    //}

    //public void setDriverWait(WebDriverWait driverWait) {
    //    this.driverWait = driverWait;
    //}

    public void openHomePage() {
        driver.navigate().to(HOME_URL);
    }

    public void openElementsPage() {
        driver.navigate().to(ELEMENTS_URL);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

}
