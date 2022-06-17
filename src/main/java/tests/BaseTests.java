package tests;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;
import pages.bookstorepage.*;
import pages.defaultpages.HomePage;
import pages.elementspages.*;

import java.time.Duration;

@Getter
public class BaseTests {

    WebDriver driver;
    WebDriverWait driverWait;

    HomePage homePage;
    ElementsPage elementsPage;
    FormsPage formsPage;
    AlertsPage alertsPage;
    WidgetsPage widgetsPage;
    InteractionsPage interactionsPage;
    BookStorePage bookStorePage;
    LoginPage loginPage;
    RegisterNewUserPage registerNewUserPage;
    TextBoxPage textBoxPage;
    CheckBoxPage checkBoxPage;
    RadioButtonPage radioButtonPage;
    WebTablesPage webTablesPage;
    ButtonsPage buttonsPage;
    LinksPage linksPage;
    ProfilePage profilePage;
    BooksPage booksPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        driver = new ChromeDriver();

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.homePage = new HomePage(driver, driverWait);
        this.elementsPage = new ElementsPage(driver, driverWait);
        this.formsPage = new FormsPage(driver, driverWait);
        this.alertsPage = new AlertsPage(driver, driverWait);
        this.widgetsPage = new WidgetsPage(driver, driverWait);
        this.interactionsPage = new InteractionsPage(driver, driverWait);
        this.bookStorePage = new BookStorePage(driver, driverWait);
        this.loginPage = new LoginPage(driver, driverWait);
        this.registerNewUserPage = new RegisterNewUserPage(driver, driverWait);
        this.textBoxPage = new TextBoxPage(driver, driverWait);
        this.checkBoxPage = new CheckBoxPage(driver, driverWait);
        this.radioButtonPage = new RadioButtonPage(driver, driverWait);
        this.webTablesPage = new WebTablesPage(driver, driverWait);
        this.buttonsPage = new ButtonsPage(driver, driverWait);
        this.linksPage = new LinksPage(driver, driverWait);
        this.profilePage = new ProfilePage(driver, driverWait);
        this.booksPage = new BooksPage(driver, driverWait);
    }

    //public WebDriver getDriver() {
    //    return driver;
    //}

    //public WebDriverWait getDriverWait() {
    //    return driverWait;
    //}

    //public HomePage getHomePage() {
    //    return homePage;
    //}

    //public ElementsPage getElementsPage() {
    //    return elementsPage;
    //}

    //public FormsPage getFormsPage() {
    //    return formsPage;
    //}

    //public AlertsPage getAlertsPagePage() {
    //    return alertsPage;
    //}

    //public WidgetsPage getWidgetsPage() {
    //    return widgetsPage;
    //}

    //public InteractionsPage getInteractionsPage() {
    //    return interactionsPage;
    //}

    //public BookStorePage getBookStorePage() {
    //    return bookStorePage;
    //}

    @AfterClass
    public void afterClass() {
        //driver.close();
    }

}
