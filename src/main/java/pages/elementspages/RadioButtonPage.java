package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

public class RadioButtonPage extends BasePage {

    private By radioButtonYes = By.id("yesRadio");
    private By radioButtonImpressive = By.id("impressiveRadio");
    private By radioButtonNo = By.id("noRadio");
    private By label = By.className("text-success");
    Actions action = new Actions(getDriver());

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getRadioButtonYes() {
        return getDriver().findElement(radioButtonYes);
    }

    public WebElement getRadioButtonImpressive(){
        return getDriver().findElement(radioButtonImpressive);
    }

    public WebElement getRadioButtonNo(){
        return getDriver().findElement(radioButtonNo);
    }

    public WebElement getLabel() {
        return getDriver().findElement(label);
    }

    public void clickRadioButtonYes() {
        //new Actions(getRadioButtonYes()).click().perform();
        //Actions action = new Actions(getDriver());
        action.moveToElement(getRadioButtonYes()).click().perform();
        //getRadioButtonYes().click();
    }

    public void clickRadioButtonImpressive() {
        //getRadioButtonImpressive().click();
        action.moveToElement(getRadioButtonImpressive()).click().perform();
    }

    public String getLabelText(){
        return getLabel().getText();
    }

    public boolean isRadioButtonNoEnabled(){
        return getRadioButtonNo().isEnabled();
    }
}
