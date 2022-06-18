package pages.alertswindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class SamplePage extends BasePage {

    private By header = By.id("sampleHeading");

    public SamplePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHeader(){
        return getDriver().findElement(header);
    }

    public String headerText(){
        return getHeader().getText();
    }
}
