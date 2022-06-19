package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class LinksPage extends BasePage {

    private By homeLink = By.id("simpleLink");
    private By homeDynamicLink = By.id("dynamicLink");
    private By createdLink =By.id("created");
    private By noContentLink =By.id("no-content");
    private By movedLink = By.id("moved");
    private By badRequestLink = By.id("bad-request");
    private By unauthorizedLink = By.id("unauthorized");
    private By forbiddenLink = By.id("forbidden");
    private By notFoundLink = By.id("invalid-url");

    private By linkResponse = By.id("linkResponse");

    public LinksPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getHomeLink(){
        return getDriver().findElement(homeLink);
    }

    public WebElement getHomeDynamicLink(){
        return getDriver().findElement(homeDynamicLink);
    }

    public WebElement getCreatedLink(){
        return getDriver().findElement(createdLink);
    }

    public WebElement getNoContentLink(){
        return getDriver().findElement(noContentLink);
    }

    public WebElement getMovedLink(){
        return getDriver().findElement(movedLink);
    }

    public WebElement getBadRequestLink(){
        return getDriver().findElement(badRequestLink);
    }

    public WebElement getUnauthorizedLink(){
        return getDriver().findElement(unauthorizedLink);
    }

    public WebElement getForbiddenLink(){
        return getDriver().findElement(forbiddenLink);
    }

    public WebElement getNotFoundLink(){
        return getDriver().findElement(notFoundLink);
    }

    public WebElement getLinkResponse(){
        return getDriver().findElement(linkResponse);
    }

    public void clickHomeLink(){
        getHomeLink().click();
    }

    public void clickHomeDynamicLink(){
        getHomeDynamicLink().click();
    }

    public void clickCreatedLink(){
        getCreatedLink().click();
    }

    public void clickNoContentLink(){
        getNoContentLink().click();
    }

    public void clickMovedLink(){
        getMovedLink().click();
    }

    public void clickBadRequestLink(){
        getBadRequestLink().click();
    }

    public void clickUnauthorizedLink(){
        getUnauthorizedLink().click();
    }

    public void clickForbiddenLink(){
        getForbiddenLink().click();
    }

    public void clickNotFoundLink(){
        getNotFoundLink().click();
    }

    public String linkResponsetext(){
        return getLinkResponse().getText();
    }

    public String getURLForNewOpenTab() {

        for(String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
        }
        return getDriver().getCurrentUrl();
    }
}
