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

    // TC27 - test click on Home link
    @Test(priority = 1)
    public void testLinkHome(){
        linksPage.clickHomeLink();

        String originalWindow = getDriver().getWindowHandle();

        Assert.assertEquals(linksPage.getURLForNewOpenTab(), "https://demoqa.com/");

        getDriver().close();
        getDriver().switchTo().window(originalWindow);
    }

    // TC28 - test click on Home Dynamic link
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

    // TC29 - test click on Created link
    @Test(priority = 3)
    public void testCreatedLink() {
        linksPage.clickCreatedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 201 and status text Created");
    }

    // TC30 - test click on Content link
    @Test(priority = 4)
    public void testNoContentLink() {
        linksPage.clickNoContentLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 204 and status text No Content");
    }

    // TC31 - test click on Moved link
    @Test(priority = 5)
    public void testMovedLink() {
        linksPage.clickMovedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 301 and status text Moved Permanently");
    }

    // TC32 - test click on Bad Request link
    @Test(priority = 6)
    public void testBadRequestLink() {
        linksPage.clickBadRequestLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 400 and status text Bad Request");
    }

    // TC33 - test click on Unauthorized link
    @Test(priority = 7)
    public void testUnauthorizedLink() {
        linksPage.clickUnauthorizedLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 401 and status text Unauthorized");
    }

    // TC34 - test click on Forbidden link
    @Test(priority = 8)
    public void testForbiddenLink() {
        linksPage.clickForbiddenLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 403 and status text Forbidden");
    }

    // TC35 - test click on Not Found link
    @Test(priority = 9)
    public void testNotFoundLink() {
        linksPage.clickNotFoundLink();
        Assert.assertEquals(linksPage.linkResponsetext(), "Link has responded with staus 404 and status text Not Found");
    }

}
