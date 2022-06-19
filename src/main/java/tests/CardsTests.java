package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CardsTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        homePage.openHomePage();
    }

    // TC01 - click on 'Elements' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 1)
    public void checkElementsCardLink() {
        homePage.clickElementCard();
        Assert.assertEquals(elementsPage.getElementPageURL(), "https://demoqa.com/elements");
        Assert.assertEquals(elementsPage.mainTitleGetText(), "Elements");
    }

    // TC02 - click on 'Forms' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 2)
    public void checkFormsCardLink() {
        homePage.clickFormCard();
        Assert.assertEquals(formsPage.getFormsPageURL(), "https://demoqa.com/forms");
        Assert.assertEquals(formsPage.mainTitleGetText(), "Forms");
    }

    // TC03 - click on 'Alerts' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 3)
    public void checkAlertsCardLink() {
        homePage.clickAlertCard();
        Assert.assertEquals(alertsPage.getAlertsPageURL(), "https://demoqa.com/alertsWindows");
        Assert.assertEquals(alertsPage.mainTitleGetText(), "Alerts, Frame & Windows");
    }

    // TC04 - click on 'Widgets' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 4)
    public void checkWidgetsCardLink() {
        homePage.clickWidgetsCard();
        Assert.assertEquals(widgetsPage.getWidgetsPageURL(), "https://demoqa.com/widgets");
        Assert.assertEquals(widgetsPage.mainTitleGetText(), "Widgets");
    }

    // TC05 - click on 'Interactions' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 5)
    public void checkInteractionsCardLink() {
        homePage.clickInteractionsCard();
        Assert.assertEquals(interactionsPage.getInteractionsPageURL(), "https://demoqa.com/interaction");
        Assert.assertEquals(interactionsPage.mainTitleGetText(), "Interactions");
    }

    // TC06 - click on 'Bookstore' card category to confirm that it opens in a new page (URL) and the main header title is adequate
    @Test(priority = 6)
    public void checkBookstoreCardLink() {
        homePage.clickBookstoreCard();
        Assert.assertEquals(bookStorePage.getBookstorePageURL(), "https://demoqa.com/books");
        Assert.assertEquals(bookStorePage.mainTitleGetText(), "Book Store");
    }

}
