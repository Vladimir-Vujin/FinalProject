package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenTests extends BaseTests{

    @BeforeMethod
    public void beforeMethod(){
        getDriver().navigate().to("https://demoqa.com/broken");
    }

    // TC36 - check that image is load
    @Test(priority = 1)
    public void checkValidImage(){
        Assert.assertEquals(brokenPage.getValidImageWidth(), 347);
        Assert.assertEquals(brokenPage.getValidImageHeight(), 100);
    }

    // TC37 - check that image isn't load
    @Test(priority = 2)
    public void checkBrokenImage(){
        Assert.assertEquals(brokenPage.getBrokenImageWidth(), 16);
        Assert.assertEquals(brokenPage.getBrokenImageHeight(), 16);
    }

    // TC38 - check that user click on valid link
    @Test(priority = 3)
    public void checkValidLink(){
        brokenPage.clickValidLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
    }

    // TC39 - check that user click on broken link
    @Test(priority = 4)
    public void checkBrokenLink(){
        brokenPage.clickBrokenLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
        Assert.assertTrue(status500Page.labelMessageTextContains());
    }
}
