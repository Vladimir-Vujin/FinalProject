package pages.bookstorepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

import java.util.List;

public class BooksPage extends BasePage  {

    private By searchBox = By.id("searchBox");
    private By linkOfThirdBook = By.id("see-book-Designing Evolvable Web APIs with ASP.NET");

    public BooksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getSearchBox(){
        return getDriver().findElement(searchBox);
    }

    public WebElement getLinkOfThirdBook(){
        return getDriver().findElement(linkOfThirdBook);
    }

    public void inputSearchBox(String search){
        getSearchBox().sendKeys(search);
    }

    public void clickLinkOfThirdBook(){
        getLinkOfThirdBook().click();
    }

    public boolean checkIfRecordSearchByAuthorExistInTable(String author){
        List<WebElement> rows = getDriver().findElements(By.xpath("//*[@class=\"rt-tr-group\"]/div"));

        for (WebElement element : rows) {
            List<WebElement> newRow = element.findElements(By.tagName("div"));

            if (newRow.get(3).getText().contains(author)){
                return true;
            }
        }
        return false;
    }

    public boolean checkIfRecordSearchByBookExistInTable(String author){
        List<WebElement> rows = getDriver().findElements(By.xpath("//*[@class=\"rt-tr-group\"]/div"));

        for (WebElement element : rows) {
            List<WebElement> newRow = element.findElements(By.tagName("div"));
            if (newRow.get(2).getText().contains(author)){
                return true;
            }
        }
        return false;
    }
}
