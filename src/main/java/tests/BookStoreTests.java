package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTests extends BaseTests {

    // TC40 verify that user can register account
    @Test(priority = 1)
    public void registerNewUser() {

        homePage.clickBookstoreCard();
        bookStorePage.clickLoginButton();
        loginPage.clickNewUserButton();

        // IMPORTANT NOTES: *************************************************************
        // IN THIS TEST YOU MUST CLICK ON CAPTCHA PICTURES MANUALLY TO RESUME TESTS!
        // ******************************************************************************
        registerNewUserPage.fillRegisterForm("Vladimir", "Vujin", "Vladimir78", "Vlada78*");

        homePage.openLoginPage();
        loginPage.fillLoginForm("Vladimir78", "Vlada78*");
        driverWait.until(ExpectedConditions.urlContains("profile"));
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/profile");
        Assert.assertEquals(profilePage.userNameLabelText(), "Vladimir78");
    }

    // TC41 - verify that user can search books by author
    @Test(priority = 2)
    public void searchBookByAuthor() {
        getDriver().navigate().to("https://demoqa.com/books");
        booksPage.inputSearchBox("Osmani");
        Assert.assertTrue(booksPage.checkIfRecordSearchByAuthorExistInTable("Osmani"));
    }

    // TC42 - verify that user can search books by book name
    @Test(priority = 3)
    public void searchBookByBookName() {
        getDriver().navigate().to("https://demoqa.com/books");
        booksPage.inputSearchBox("Learning");
        Assert.assertTrue(booksPage.checkIfRecordSearchByBookExistInTable("Learning"));
    }

    // TC43 - verify that user can click on boom and get detiled information
    @Test(priority = 4)
    public void getBookInfo() {
        getDriver().navigate().to("https://demoqa.com/books");
        booksPage.clickLinkOfThirdBook();
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"title-wrapper\"]/div[2]")).getText(),
                "Designing Evolvable Web APIs with ASP.NET");
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"author-wrapper\"]/div[2]")).getText(), "Glenn Block et al.");
        Assert.assertEquals(getDriver().findElement(By.xpath("//*[@id=\"publisher-wrapper\"]/div[2]")).getText(), "O'Reilly Media");
    }

    // TC44 - verify that user can logout
    @Test(priority = 5)
    public void userLogOut() {
        homePage.openLoginPage();
        loginPage.clickLogoutButton();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/login");
        Assert.assertEquals(loginPage.mainHeaderText(), "Login");
    }

    //***********************************************************************************
    // UNDER CONSTRUCTION
    //***********************************************************************************
    // User can delete registration account
    @Test(priority = 6)
    public void deleteUserAccount() {
        homePage.openLoginPage();

        loginPage.fillLoginForm("Vladimir78", "Vlada78*");
        driverWait.until(ExpectedConditions.urlContains("profile"));

        profilePage.clickDeleteAccountButton();
        profilePage.clickConfirmDeleteButtonOnModal();

        getDriverWait().until(ExpectedConditions.alertIsPresent());
        getDriver().switchTo().alert().accept();

        homePage.openLoginPage();
        loginPage.fillLoginForm("Vladimir78", "Vlada78*");
        Assert.assertEquals(loginPage.getLabelInvalidUserInfo().getText(), "Invalid username or password!");
    }
}
