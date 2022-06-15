package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTests {

    @Test(priority = 1)
    public void clickDoubleClickButton(){
        elementsPage.openElementsPage();
        elementsPage.clickElementButtons();
        buttonsPage.clickDoubleClickButton();
        Assert.assertTrue(buttonsPage.isVisibleDoubleClickMessage());
        Assert.assertEquals(buttonsPage.doubleClickMessageText(), "You have done a double click");
    }

    @Test(priority = 2)
    public void clickRightClickButton(){
        buttonsPage.clickRightClickButton();
        Assert.assertTrue(buttonsPage.isVisibleRightClickMessage());
        Assert.assertEquals(buttonsPage.rightClickMessageText(), "You have done a right click");
    }

    @Test(priority = 3)
    public void clickClickButton(){
        buttonsPage.clickClickButton();
        Assert.assertTrue(buttonsPage.isVisibleClickMessage());
        Assert.assertEquals(buttonsPage.clickMessageText(), "You have done a dynamic click");
    }
}
