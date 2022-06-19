package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTests{

    @Test(priority = 1)
    public void testInputTextBoxValidData(){
        elementsPage.openElementsPage();
        elementsPage.clickElementTextBox();
        textBoxPage.fillAllTextBoxes(getFullName(), getEmail(), getCurrentAddress(), getPermanentAddress());

        Assert.assertTrue(textBoxPage.isFrameVisible());
        Assert.assertEquals(textBoxPage.nameLabelText(), "Name:" + getFullName());
        Assert.assertEquals(textBoxPage.emailLabelText(), "Email:" + getEmail());
        Assert.assertEquals(textBoxPage.currentAddressLabelText(), "Current Address :" + getCurrentAddress());

        // IMPORTANT NOTES: **********************************************************************************
        // COMMENT: IN THIS SCENARIO THIS SHOULD BE FAIL BECAUSE THERE IS SPELLING MISTAKE IN LABEL 'Permanant'
        // ***************************************************************************************************
        Assert.assertEquals(textBoxPage.permanentAddressLabelText(), "Permananet Address :" + getPermanentAddress());
    }

    @Test(priority = 2)
    public void testInputTextBoxInvalidData(){
        elementsPage.openElementsPage();
        elementsPage.clickElementTextBox();
        textBoxPage.fillAllTextBoxes(getFullName(), getInvalidEmail(), getCurrentAddress(), getPermanentAddress());

        Assert.assertFalse(textBoxPage.isFrameVisible());
    }
}
