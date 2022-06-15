package pages.elementspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class CheckBoxPage extends BasePage {

    private By checkBox = By.className("rct-checkbox");
    private By resultLabel = By.id("result");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCheckBox(){
        return getDriver().findElement(checkBox);
    }

    public WebElement getResultLabel() {
        return getDriver().findElement(resultLabel);
    }

    public void clickCheckBox(){
        getCheckBox().click();
    }

    public boolean isResultLabelDisplayed(){
        return getResultLabel().isDisplayed();
    }
}
