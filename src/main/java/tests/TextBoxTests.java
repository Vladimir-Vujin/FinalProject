package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTests{

    @Test(priority = 1)
    public void testInputTextBoxValidData(){
        elementsPage.openElementsPage();
        elementsPage.clickElementTextBox();
        textBoxPage.fillAllTextBoxes("Vladimir Vujin", "vujin@gmail.com", "Istarska bb",
                "Istarska 100");

        Assert.assertTrue(textBoxPage.isFrameVisible());
        Assert.assertEquals(textBoxPage.nameLabelText(), "Name:Vladimir Vujin");
        Assert.assertEquals(textBoxPage.emailLabelText(), "Email:vujin@gmail.com");
        Assert.assertEquals(textBoxPage.currentAddressLabelText(), "Current Address :Istarska bb");

        // IMPORTANT NOTES: **********************************************************************************
        // COMMENT: IN THIS SCENARIO THIS SHOULD BE FAIL BECAUSE THERE IS SPELLING MISTAKE IN LABEL 'Permanant'
        // ***************************************************************************************************
        Assert.assertEquals(textBoxPage.permanentAddressLabelText(), "Permananet Address :Istarska 100");
    }

    @Test(priority = 2)
    public void testInputTextBoxInvalidData(){
        elementsPage.openElementsPage();
        elementsPage.clickElementTextBox();
        textBoxPage.fillAllTextBoxes("Vladimir Vujin", "vujingmail.com", "Istarska bb",
                "Istarska 100");
        Assert.assertFalse(textBoxPage.isFrameVisible());
    }
}
