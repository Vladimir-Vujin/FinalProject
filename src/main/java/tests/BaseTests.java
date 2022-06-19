package tests;

import lombok.Getter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.alertswindows.*;
import pages.bookstorepage.*;
import pages.defaultpages.HomePage;
import pages.elementspages.*;
import pages.formspage.FormsPage;
import pages.interactionspage.InteractionsPage;
import pages.widgetspage.WidgetsPage;

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
    AlertsWindowsPage alertsFrameWindowsPage;
    BrowserWindowsPage browserWindowsPage;
    SamplePage samplePage;
    BrokenPage brokenPage;
    Status500Page status500Page;
    ModalDialogsPage modalDialogsPage;

    Alert alert;

    private String fullName = "Vladimir Vujin";
    private String email = "vujin@gmail.com";
    private String invalidEmail = "vujingmail.com";
    private String currentAddress = "Istarska bb";
    private String permanentAddress = "Istarska 100";
    private String firstName = "Petar";
    private String lastName = "Petrovic";
    private String age = "40";
    private String emailT = "ptrptr@gmail.com";
    private String salary = "50000";
    private String department = "Economy";
    private String firstName2 = "Jovan";
    private String lastName2 = "Jovanovic";
    private String age2 = "20";
    private String emailT2 = "jovica@gmail.com";
    private String salary2 = "20000";
    private String department2 = "Philosophy";

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
        this.alertsFrameWindowsPage = new AlertsWindowsPage(driver, driverWait);
        this.browserWindowsPage = new BrowserWindowsPage(driver, driverWait);
        this.samplePage = new SamplePage(driver, driverWait);
        this.brokenPage = new BrokenPage(driver, driverWait);
        this.status500Page = new Status500Page(driver, driverWait);
        this.modalDialogsPage = new ModalDialogsPage(driver, driverWait);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }

}
