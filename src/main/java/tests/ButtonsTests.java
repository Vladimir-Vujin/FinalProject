package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod(){
        //elementsPage.openElementsPage();
        getDriver().navigate().to("https://demoqa.com/buttons");
    }

    @Test(priority = 1)
    public void clickDoubleClickButtonDoubleClick(){
        buttonsPage.clickDoubleClickButtonDoubleClick();
        Assert.assertTrue(buttonsPage.checkIsDoubleClickMessageExist());
        Assert.assertEquals(buttonsPage.doubleClickMessageText(), "You have done a double click");
    }

    @Test(priority = 2)
    public void clickDoubleClickButtonSingleClick(){
        buttonsPage.clickDoubleClickButtonSingleClick();
        Assert.assertFalse(buttonsPage.checkIsDoubleClickMessageExist());
    }

    @Test(priority = 3)
    public void clickDoubleClickButtonRightClick(){
        buttonsPage.clickDoubleClickButtonRightClick();
        Assert.assertFalse(buttonsPage.checkIsDoubleClickMessageExist());
    }

    @Test(priority = 4)
    public void clickRightClickButtonRightClick(){
        buttonsPage.clickRightClickButtonRightClick();
        Assert.assertTrue(buttonsPage.checkIsRightClickMessageExist());
        Assert.assertEquals(buttonsPage.rightClickMessageText(), "You have done a right click");
    }

    @Test(priority = 5)
    public void clickRightClickButtonSingleClick(){
        buttonsPage.clickRightClickButtonSingleClick();
        Assert.assertFalse(buttonsPage.checkIsRightClickMessageExist());
    }

    @Test(priority = 6)
    public void clickRightClickButtonDoubleClick(){
        buttonsPage.clickRightClickButtonDoubleClick();
        Assert.assertFalse(buttonsPage.checkIsRightClickMessageExist());
    }

    @Test(priority = 7)
    public void clickClickButtonSingleClick(){
        buttonsPage.clickClickButtonSingleClick();
        Assert.assertTrue(buttonsPage.checkIsClickMessageExist());
        Assert.assertEquals(buttonsPage.clickMessageText(), "You have done a dynamic click");
    }

    @Test(priority = 8)
    public void clickClickButtonRightClick(){
        buttonsPage.clickClickButtonRightClick();
        Assert.assertFalse(buttonsPage.checkIsClickMessageExist());
    }

    @Test(priority = 9)
    public void clickClickButtonDoubleClick(){
        buttonsPage.clickClickButtonDoubleClick();
        Assert.assertTrue(buttonsPage.checkIsClickMessageExist());
        Assert.assertEquals(buttonsPage.clickMessageText(), "You have done a dynamic click");
    }
}
