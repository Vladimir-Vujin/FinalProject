package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        //elementsPage.openElementsPage();
        getDriver().navigate().to("https://demoqa.com/buttons");
    }

    // TC18 - verify that user double click on 'Double Click Me' button
    @Test(priority = 1)
    public void clickDoubleClickButtonDoubleClick() {
        buttonsPage.clickDoubleClickButtonDoubleClick();
        Assert.assertTrue(buttonsPage.checkIsDoubleClickMessageExist());
        Assert.assertEquals(buttonsPage.doubleClickMessageText(), "You have done a double click");
    }

    // TC19 - verify that user single click on 'Double Click Me' button
    @Test(priority = 2)
    public void clickDoubleClickButtonSingleClick() {
        buttonsPage.clickDoubleClickButtonSingleClick();
        Assert.assertFalse(buttonsPage.checkIsDoubleClickMessageExist());
    }

    // TC20 - verify that user right click on 'Double Click Me' button
    @Test(priority = 3)
    public void clickDoubleClickButtonRightClick() {
        buttonsPage.clickDoubleClickButtonRightClick();
        Assert.assertFalse(buttonsPage.checkIsDoubleClickMessageExist());
    }

    // TC21 - verify that user right click on 'Right Click Me' button
    @Test(priority = 4)
    public void clickRightClickButtonRightClick() {
        buttonsPage.clickRightClickButtonRightClick();
        Assert.assertTrue(buttonsPage.checkIsRightClickMessageExist());
        Assert.assertEquals(buttonsPage.rightClickMessageText(), "You have done a right click");
    }

    // TC22 - verify that user single click on 'Right Click Me' button
    @Test(priority = 5)
    public void clickRightClickButtonSingleClick() {
        buttonsPage.clickRightClickButtonSingleClick();
        Assert.assertFalse(buttonsPage.checkIsRightClickMessageExist());
    }

    // TC23 - verify that user double click on 'Right Click Me' button
    @Test(priority = 6)
    public void clickRightClickButtonDoubleClick() {
        buttonsPage.clickRightClickButtonDoubleClick();
        Assert.assertFalse(buttonsPage.checkIsRightClickMessageExist());
    }

    // TC24 - verify that user single click on 'Click Me' button
    @Test(priority = 7)
    public void clickClickButtonSingleClick() {
        buttonsPage.clickClickButtonSingleClick();
        Assert.assertTrue(buttonsPage.checkIsClickMessageExist());
        Assert.assertEquals(buttonsPage.clickMessageText(), "You have done a dynamic click");
    }

    // TC25 - verify that user right click on 'Click Me' button
    @Test(priority = 8)
    public void clickClickButtonRightClick() {
        buttonsPage.clickClickButtonRightClick();
        Assert.assertFalse(buttonsPage.checkIsClickMessageExist());
    }

    // TC26 - verify that user double click on 'Click Me' button
    @Test(priority = 9)
    public void clickClickButtonDoubleClick() {
        buttonsPage.clickClickButtonDoubleClick();
        Assert.assertTrue(buttonsPage.checkIsClickMessageExist());
        Assert.assertEquals(buttonsPage.clickMessageText(), "You have done a dynamic click");
    }
}
