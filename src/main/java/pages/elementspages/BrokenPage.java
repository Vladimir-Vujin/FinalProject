package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class BrokenPage extends BasePage {

    private By validImage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]");
    private By brokenImage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]");
    private By validLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]");
    private By brokenLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]");

    public BrokenPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getValidImage() {
        return getDriver().findElement(validImage);
    }

    public WebElement getBrokenImage() {
        return getDriver().findElement(brokenImage);
    }

    public WebElement getValidLink() {
        return getDriver().findElement(validLink);
    }

    public WebElement getBrokenLink() {
        return getDriver().findElement(brokenLink);
    }

    public int getValidImageWidth(){
        return getValidImage().getSize().getWidth();
    }

    public int getValidImageHeight(){
        return getValidImage().getSize().getHeight();
    }

    public int getBrokenImageWidth(){
        return getBrokenImage().getSize().getWidth();
    }

    public int getBrokenImageHeight(){
        return getBrokenImage().getSize().getHeight();
    }

    public void clickValidLink(){
        getValidLink().click();
    }

    public void clickBrokenLink(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getBrokenLink().click();
    }
}
