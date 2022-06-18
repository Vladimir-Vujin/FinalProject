package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        getDriver().navigate().to("https://demoqa.com/alerts");
    }

    @Test(priority =  1)
    public void testClickButtonToSeeAlert() {
        alertsPage.clickAlertButton();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You clicked a button");
        alert.accept();
    }

    @Test(priority =  2)
    public void testClickButtonToSeeAlertFor5Seconds() {
        alertsPage.clickTimerAlertButton();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "This alert appeared after 5 seconds");
        alert.accept();
    }

    @Test(priority =  3)
    public void testConfirmAlertOk() {
        alertsPage.clickConfirmAlertButton();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Do you confirm action?");
        alert.accept();
        Assert.assertEquals(alertsPage.labelMessageText(), "You selected Ok");
    }

    @Test(priority =  4)
    public void testConfirmAlertCancel() {
        alertsPage.clickConfirmAlertButton();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Do you confirm action?");
        alert.dismiss();
        Assert.assertEquals(alertsPage.labelMessageText(), "You selected Cancel");
    }

    @Test(priority =  5)
    public void testPromptAlert() {
        alertsPage.clickPromptAlertButton();
        alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter your name");
        alert.sendKeys("Vladimir");
        alert.accept();
        Assert.assertEquals(alertsPage.promptLabelMessageText(), "You entered Vladimir");
    }
}
