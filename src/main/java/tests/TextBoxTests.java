package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTests{

    @BeforeMethod
    public void beforeMethod(){
        elementsPage.openElementsPage();
        elementsPage.clickElementTextBox();
    }

    // TC07 - Verify that text fields work when we enter correct data
    @Test(priority = 1)
    public void testInputTextBoxValidData(){
        textBoxPage.fillAllTextBoxes(getFullName(), getEmail(), getCurrentAddress(), getPermanentAddress());
        Assert.assertTrue(textBoxPage.isFrameVisible());
        Assert.assertEquals(textBoxPage.nameLabelText(), "Name:" + getFullName());
        Assert.assertEquals(textBoxPage.emailLabelText(), "Email:" + getEmail());
        Assert.assertEquals(textBoxPage.currentAddressLabelText(), "Current Address :" + getCurrentAddress());

        // IMPORTANT NOTES: **********************************************************************************
        // COMMENT: IN THIS SCENARIO TEST SHOULD BE FAIL BECAUSE THERE IS SPELLING MISTAKE IN LABEL 'Permanant'
        // ***************************************************************************************************
        Assert.assertEquals(textBoxPage.permanentAddressLabelText(), "Permananet Address :" + getPermanentAddress());
    }

    // TC08 - Verify that text fields work when we enter incorrect data for email
    @Test(priority = 2)
    public void testInputTextBoxInvalidData(){
        textBoxPage.fillAllTextBoxes(getFullName(), getInvalidEmail(), getCurrentAddress(), getPermanentAddress());
        Assert.assertFalse(textBoxPage.isFrameVisible());
    }
}
