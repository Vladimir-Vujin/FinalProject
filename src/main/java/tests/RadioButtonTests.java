package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        elementsPage.openElementsPage();
        elementsPage.clickElementRadioButton();
    }

    // TC12 - verify that radio button Yes is selected after user click on it
    @Test(priority = 1)
    public void clickRadioButtonYesTest() {
        radioButtonPage.clickRadioButtonYes();
        Assert.assertEquals(radioButtonPage.getLabelText(), "Yes");
        Assert.assertTrue(radioButtonPage.getRadioButtonYes().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonImpressive().isSelected());
    }

    // TC13 - verify that radio button Impressive is selected after user click on it
    @Test(priority = 2)
    public void clickRadioButtonImpressiveTest() {
        radioButtonPage.clickRadioButtonImpressive();
        Assert.assertEquals(radioButtonPage.getLabelText(), "Impressive");
        Assert.assertTrue(radioButtonPage.getRadioButtonImpressive().isSelected());
        Assert.assertFalse(radioButtonPage.getRadioButtonYes().isSelected());
    }

    // TC14 - verify that radio button No is disabled
    @Test(priority = 3)
    public void clickRadioButtonNoIsDisabled() {
        Assert.assertFalse(radioButtonPage.isRadioButtonNoEnabled());
    }
}
