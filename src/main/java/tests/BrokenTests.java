package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenTests extends BaseTests{

    @BeforeMethod
    public void beforeMethod(){
        getDriver().navigate().to("https://demoqa.com/broken");
    }

    @Test(priority = 1)
    public void checkValidImage(){
        Assert.assertEquals(brokenPage.getValidImageWidth(), 347);
        Assert.assertEquals(brokenPage.getValidImageHeight(), 100);
    }

    @Test(priority = 2)
    public void checkBrokenImage(){
        Assert.assertEquals(brokenPage.getBrokenImageWidth(), 16);
        Assert.assertEquals(brokenPage.getBrokenImageHeight(), 16);
    }

    @Test(priority = 3)
    public void checkValidLink(){
        brokenPage.clickValidLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
    }

    @Test(priority = 4)
    public void checkBrokenLink(){
        brokenPage.clickBrokenLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
        Assert.assertTrue(status500Page.labelMessageTextContains());
    }
}
