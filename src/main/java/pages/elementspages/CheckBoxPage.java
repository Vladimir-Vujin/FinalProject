package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class CheckBoxPage extends BasePage {
    private By checkBoxHome = By.className("rct-checkbox");
    private By resultLabel = By.id("result");
    private By expandIcon = By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By checkBoxOffice = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]");

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCheckBoxHome() {
        return getDriver().findElement(checkBoxHome);
    }

    public WebElement getResultLabel() {
        return getDriver().findElement(resultLabel);
    }

    public WebElement getExpandIcon() {
        return getDriver().findElement(expandIcon);
    }

    public WebElement getCheckBoxOffice() {
        return getDriver().findElement(checkBoxOffice);
    }

    public void clickCheckBoxHome() {
        getCheckBoxHome().click();
    }

    /**
     * Method check if result label is displayed or not
     * @return
     */
    public boolean isResultLabelDisplayed() {
        try {
            getResultLabel().isDisplayed();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean isCheckBoxHomeChecked() {
        return getCheckBoxHome().isSelected();
    }

    public void clickExpandIcon() {
        getExpandIcon().click();
    }

    public void clickCheckButtonOffice() {
        getCheckBoxOffice().click();
    }
}
