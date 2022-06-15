package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTests {

    @Test(priority = 1)
    public void testClickOnCheckBox(){
        elementsPage.openElementsPage();
        elementsPage.clickElementCheckBox();
        checkBoxPage.clickCheckBox();
        Assert.assertTrue(checkBoxPage.isResultLabelDisplayed());
    }

    @Test(priority = 2)
    public void testClickOffCheckBox(){
        checkBoxPage.clickCheckBox();
        Assert.assertFalse(checkBoxPage.isCheckBoxChecked());
    }

    @Test(priority = 3)
    public void testClickOnCheckBoxOffice(){
        elementsPage.openElementsPage();
        elementsPage.clickElementCheckBox();
        checkBoxPage.clickExpandIcon();
        checkBoxPage.clickCheckButtonOffice();
        Assert.assertTrue(checkBoxPage.isResultLabelDisplayed());
    }
}
