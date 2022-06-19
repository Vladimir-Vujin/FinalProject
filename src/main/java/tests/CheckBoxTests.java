package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTests {

    // TC09 - verify that message appears when check box Home is checked
    @Test(priority = 1)
    public void testClickOnCheckBox() {
        elementsPage.openElementsPage();
        elementsPage.clickElementCheckBox();
        checkBoxPage.clickCheckBoxHome();
        Assert.assertTrue(checkBoxPage.isResultLabelDisplayed());
    }

    // TC10 - verify that checked check box Home is unchecked when clicks on it
    @Test(priority = 2)
    public void testClickOffCheckBox() {
        checkBoxPage.clickCheckBoxHome();
        Assert.assertFalse(checkBoxPage.isCheckBoxHomeChecked());
        Assert.assertFalse(checkBoxPage.isResultLabelDisplayed());
    }

    // TC11 - verify that message appears when check box Office is checked
    @Test(priority = 3)
    public void testClickOnCheckBoxOffice() {
        elementsPage.openElementsPage();
        elementsPage.clickElementCheckBox();
        checkBoxPage.clickExpandIcon();
        checkBoxPage.clickCheckButtonOffice();
        Assert.assertTrue(checkBoxPage.isResultLabelDisplayed());
    }
}
