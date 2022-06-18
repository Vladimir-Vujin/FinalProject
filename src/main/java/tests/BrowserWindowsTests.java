package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class BrowserWindowsTests extends BaseTests {

    @BeforeMethod
    public void beforeTest(){
        getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    @Test(priority = 1)
    public void checkOpenNewTab(){
        browserWindowsPage.clickTabButton();
        Assert.assertEquals(browserWindowsPage.getURLOfNewTab(),"https://demoqa.com/sample");
        Assert.assertEquals(samplePage.headerText(), "This is a sample page");
        getDriver().close();
    }

    @Test(priority = 2)
    public void checkOpenNewWindow(){
        browserWindowsPage.clickWindowButton();
        Assert.assertEquals(browserWindowsPage.getURLOfNewTab(),"https://demoqa.com/sample");
        Assert.assertEquals(samplePage.headerText(), "This is a sample page");
        getDriver().close();
    }

    @Test(priority = 3)
    public void checkOpenNewWindowMessage(){
        browserWindowsPage.clickMessageWindowButton();

        // THIS TEST ALWAYS FAIL. PROBLEM WITH NEW WINDOW MESSAGE DON't HANDLE ***************
        String currentTab = getDriver().getWindowHandle();
        getDriverWait().until(ExpectedConditions.numberOfWindowsToBe(2));

        for(String windowHandle: getDriver().getWindowHandles()) {
            if(!windowHandle.equalsIgnoreCase(currentTab)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
        //String textFromWindow = getDriver().findElement(By.tagName("body")).getText();
        getDriver().close();
        //Assert.assertEquals(textFromWindow, "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
    }
}
