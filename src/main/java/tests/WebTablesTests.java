package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTests extends BaseTests {

    @BeforeMethod
    public void beforeMethod() {
        elementsPage.openElementsPage();
        elementsPage.clickElementWebTables();
    }

    @Test(priority = 1)
    public void testAddNewRecordToTable() {
        webTablesPage.clickAddButton();
        webTablesPage.fillRegistrationForm("Petar", "Petrovic", "40",
                "ptrptr@gmail.com", "50000", "Legal");

        // Check new records
        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable("Petar", "Petrovic", "40",
                "ptrptr@gmail.com", "50000", "Legal"));
    }

    @Test(priority = 2)
    public void testUpdateRecordInTable() {
        webTablesPage.clickEditRecord1Button();
        webTablesPage.clearAndFillRegistrationFormFields("Jovan", "Jovanovic", "20",
                "jovica@gmail.com", "20000", "Philosophy");
        // Check update records
        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable("Jovan", "Jovanovic", "20",
                "jovica@gmail.com", "20000", "Philosophy"));
    }

    @Test(priority = 3)
    public void testDeleteRecordFromTable() {
        int numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(2);

        // Check number of records in table
        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);

        numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(1);

        // Check number of records in table
        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);
    }
}

// PATH ZA ALERTS
//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]
// By.xpath("//*[text()='Alerts']");

