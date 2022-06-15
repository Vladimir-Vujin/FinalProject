package pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
@Data
public class HomePage extends BasePage {

    private By elementsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By formsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By alertsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By widgetsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By interactionsCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By bookstoreCard = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getElementCard() {
        return getDriver().findElement(elementsCard);
    }

    public WebElement getFormCard() {
        return getDriver().findElement(formsCard);
    }

    public WebElement getAlertCard() {
        return getDriver().findElement(alertsCard);
    }

    public WebElement getWidgetsCard() {
        return getDriver().findElement(widgetsCard);
    }

    public WebElement getInteractionsCard() {
        return getDriver().findElement(interactionsCard);
    }

    public WebElement getBookstoreCard() {
        return getDriver().findElement(bookstoreCard);
    }

    public void clickElementCard(){
        getElementCard().click();
    }

    public void clickFormCard(){
        getFormCard().click();
    }

    public void clickAlertCard(){
        getAlertCard().click();
    }

    public void clickWidgetsCard(){
        getWidgetsCard().click();
    }

    public void clickInteractionsCard(){
        getInteractionsCard().click();
    }

    public void clickBookstoreCard(){
        getBookstoreCard().click();
    }
}
