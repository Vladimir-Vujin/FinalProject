package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class Status500Page extends BasePage{

    private By labelMessage =By.xpath("//*[@id=\"content\"]/div/p");

    public Status500Page(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getLabelMessage() {
        return getDriver().findElement(labelMessage);
    }

    public String labelMessageText(){
        return getLabelMessage().getText();
    }

    public boolean labelMessageTextContains(){
        return (labelMessageText().contains("This page returned a 500 status code."));
    }
}
