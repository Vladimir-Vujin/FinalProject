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

    // TC15 - verify that user can add new records in table
    @Test(priority = 1)
    public void testAddNewRecordToTable() {
        webTablesPage.clickAddButton();

        webTablesPage.fillRegistrationForm(getFirstName(), getLastName(), getAge(), getEmailT(), getSalary(), getDepartment());

        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable(getFirstName(), getLastName(), getAge(),
                getEmailT(), getSalary(), getDepartment()));
    }

    // TC16 - verify that user can edit data in records in table
    @Test(priority = 2)
    public void testUpdateRecordInTable() {
        webTablesPage.clickEditRecord1Button();

        webTablesPage.clearAndFillRegistrationFormFields(getFirstName2(), getLastName2(), getAge2(),
                getEmailT2(), getSalary2(), getDepartment2());

        Assert.assertTrue(webTablesPage.checkIfRecordExistInTable(getFirstName2(), getLastName2(), getAge2(),
                getEmailT2(), getSalary2(), getDepartment2()));
    }

    // TC17 - verify that user can delete records from table
    @Test(priority = 3)
    public void testDeleteRecordFromTable() {
        int numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(3);

        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);

        numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(2);

        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);

        numberOfRow = webTablesPage.countNumberOfRecords();
        webTablesPage.clickDeleteButton(1);

        Assert.assertEquals(webTablesPage.countNumberOfRecords(), numberOfRow - 1);
    }
}


