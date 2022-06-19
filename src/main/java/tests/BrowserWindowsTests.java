package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends BaseTests {

    @BeforeMethod
    public void beforeTest() {
        getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    // *** UNDER CONSTRUCTION ******************************************************************
    // TESTS WORK INDIVIDUALLY, SECOND DO NOT WHEN RUN SIMULTANEOUSLY ***************************

    // TC51 - verify that new tab opens
    @Test(priority = 1)
    public void checkOpenNewTab() {
        browserWindowsPage.clickTabButton();
        Assert.assertEquals(browserWindowsPage.getURLOfNewTab(), "https://demoqa.com/sample");
        Assert.assertEquals(samplePage.headerText(), "This is a sample page");
        //getDriver().close();
    }

    // TC51 - verify that new window opens
    @Test(priority = 2)
    public void checkOpenNewWindow() {
        browserWindowsPage.clickWindowButton();
        Assert.assertEquals(browserWindowsPage.getURLOfNewTab(), "https://demoqa.com/sample");
        Assert.assertEquals(samplePage.headerText(), "This is a sample page");
        //getDriver().close();
    }

    // TEST IN CONSTRUCTION ********************************************************************
    // THIS TEST ALWAYS FAIL. PROBLEM WITH NEW WINDOW MESSAGE, CAN'T GET TEXT ***************
    // TC51 - verify that new window message opens
    /* @Test(priority = 3)
    public void checkOpenNewWindowMessage(){
        browserWindowsPage.clickMessageWindowButton();

        String currentTab = getDriver().getWindowHandle();
        getDriverWait().until(ExpectedConditions.numberOfWindowsToBe(2));

        for(String windowHandle: getDriver().getWindowHandles()) {
            if(!windowHandle.equalsIgnoreCase(currentTab)) {
                getDriver().switchTo().window(windowHandle);
            }
        }

        WebElement textFromWindow = getDriver().findElement(By.xpath("/html/body/text()"));
        System.out.println("Text from message window is " + textFromWindow.getText());
        getDriver().close();
        Assert.assertEquals(textFromWindow, "Knowledge increases by sharing but not by saving.
        Please share this website with your friends and in your organization.");
    } */
}
