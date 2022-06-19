package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        elementsPage.openElementsPage();
        elementsPage.clickElementLinks();
    }
    @Test(priority = 1)
    public void testLinkHome(){
        linksPage.clickHomeLink();

        String originalWindow = getDriver().getWindowHandle();

        Assert.assertEquals(linksPage.getURLForNewOpenTab(), "https://demoqa.com/");

        getDriver().close();
        getDriver().switchTo().window(originalWindow);
    }

    @Test(priority = 2)
    public void testLinkHomeDynamic(){
        linksPage.clickHomeDynamicLink();

        String originalWindow = getDriver().getWindowHandle();

        Assert.assertEquals(linksPage.getURLForNewOpenTab(), "https://demoqa.com/");

        getDriver().close();
        getDriver().switchTo().window(originalWindow);
    }

    // IMPORTANT NOTES: **********************************************************************************
    // COMMENT: IN THIS SCENARIO ALL TEST SHOULD BE FAIL BECAUSE THERE IS SPELLING MISTAKE IN LABEL 'staus'
    // ***************************************************************************************************
    @Test(priority = 3)
    public void testCreatedLink() {
        linksPage.clickCreatedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 201 and status text Created");
    }

    @Test(priority = 4)
    public void testNoContentLink() {
        linksPage.clickNoContentLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 204 and status text No Content");
    }

    @Test(priority = 5)
    public void testMovedLink() {
        linksPage.clickMovedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    @Test(priority = 6)
    public void testBadRequestLink() {
        linksPage.clickBadRequestLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 400 and status text Bad Request");
    }

    @Test(priority = 7)
    public void testUnauthorizedLink() {
        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 401 and status text Unauthorized");
    }

    @Test(priority = 8)
    public void testForbiddenLink() {
        linksPage.clickForbiddenLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 403 and status text Forbidden");
    }

    @Test(priority = 9)
    public void testNotFoundLink() {
        linksPage.clickNotFoundLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 404 and status text Not Found");
    }

}
