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

        webTablesPage.fillRegistrationForm(getFirstName(), getLastName(), getAge(), getEmailT(), getSalary(), getDepartment());

        // Check new records
        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable(getFirstName(), getLastName(), getAge(),
                getEmailT(), getSalary(), getDepartment()));
    }

    @Test(priority = 2)
    public void testUpdateRecordInTable() {
        webTablesPage.clickEditRecord1Button();

        webTablesPage.clearAndFillRegistrationFormFields(getFirstName2(), getLastName2(), getAge2(),
                getEmailT2(), getSalary2(), getDepartment2());

        // Check update records
        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable(getFirstName2(), getLastName2(), getAge2(),
                getEmailT2(), getSalary2(), getDepartment2()));
    }

    @Test(priority = 3)
    public void testDeleteRecordFromTable() {
        int numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(3);

        // Check number of records in table
        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);

        numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(2);

        // Check number of records in table
        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);

        numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(1);

        // Check number of records in table
        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);
    }
}


