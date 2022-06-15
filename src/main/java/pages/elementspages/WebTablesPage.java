package pages.elementspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.defaultpages.BasePage;

import java.util.List;

public class WebTablesPage extends BasePage {

    private By addButton = By.id("addNewRecordButton");
    private By firstNameTextBox = By.id("firstName");
    private By lastNameTextBox = By.id("lastName");
    private By emailTextBox = By.id("userEmail");
    private By ageTextBox = By.id("age");
    private By salaryTextBox = By.id("salary");
    private By departmentTextBox = By.id("department");
    private By submitButton = By.id("submit");

    private By tableBody = By.className("rt-tbody");
    private By editRecord1Button = By.id("edit-record-1");
    //private By deleteButton = By.id("delete-record-2");

    // Ovo je xpath do action buttona brisanje i azuriranje
    //*[@class = "rt-td"]/div[1]

    public WebTablesPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAddButton() {
        return getDriver().findElement(addButton);
    }

    public WebElement getFirstNameTextBox() {
        return getDriver().findElement(firstNameTextBox);
    }

    public WebElement getLastNameTextBox() {
        return getDriver().findElement(lastNameTextBox);
    }

    public WebElement getEmailTextBox() {
        return getDriver().findElement(emailTextBox);
    }

    public WebElement getAgeTextBox() {
        return getDriver().findElement(ageTextBox);
    }

    public WebElement getSalaryTextBox() {
        return getDriver().findElement(salaryTextBox);
    }

    public WebElement getDepartmentTextBox() {
        return getDriver().findElement(departmentTextBox);
    }

    public WebElement getSubmitButton() {
        return getDriver().findElement(submitButton);
    }

    public WebElement getTableBody(){
        return getDriver().findElement(tableBody);
    }

    public WebElement getEditRecordButton() {
        return getDriver().findElement(editRecord1Button);
    }

    public void clickAddButton(){
        getAddButton().click();
    }

    public void inputFirstName(String firstName){
        getFirstNameTextBox().sendKeys(firstName);
    }

    public void inputLastName(String lastName){
        getLastNameTextBox().sendKeys(lastName);
    }

    public void inputEmail(String email){
        getEmailTextBox().sendKeys(email);
    }

    public void inputAge(String age){
        getAgeTextBox().sendKeys(age);
    }

    public void inputSalary(String salary){
        getSalaryTextBox().sendKeys(salary);
    }

    public void inputDepartment(String department){
        getDepartmentTextBox().sendKeys(department);
    }

    public void clickSubmitButton(){
        getSubmitButton().click();
    }

    public void fillRegistrationForm(String firstName, String lastName, String age, String email, String salary, String department){
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(email);
        inputAge(age);
        inputSalary(salary);
        inputDepartment(department);
        clickSubmitButton();
    }

    public boolean checkIfRecordExistInTable(String firstName, String lastName, String age, String email, String salary, String department){
        List<WebElement> rows = getDriver().findElements(By.xpath("//*[@class=\"rt-tr-group\"]/div"));

        for (WebElement element : rows) {
            List<WebElement> newRow = element.findElements(By.tagName("div"));

            if (newRow.get(0).getText().equals(firstName) && newRow.get(1).getText().equals(lastName) && newRow.get(2).getText().equals(age)
                    && newRow.get(3).getText().equals(email) && newRow.get(4).getText().equals(salary) && newRow.get(5).getText().equals(department)){
                return true;
            }
        }
        return false;
    }

    public int countNumberOfRecords(){
        int counter = 0;
        List<WebElement> records = getTableBody().findElements(By.className("rt-tr"));
        for (WebElement element : records) {
            if (element.findElement(By.className("rt-td")).getText().matches("[a-zA-Z]+")){
                counter++;
            }
        }
        return counter;
    }

    public void clickEditRecord1Button() {
        getEditRecordButton().click();
    }

    public void clearAndFillRegistrationFormFields(String firstName, String lastName, String age, String email, String salary, String department)  {
        getFirstNameTextBox().clear();
        inputFirstName(firstName);
        getLastNameTextBox().clear();
        inputLastName(lastName);
        getEmailTextBox().clear();
        inputEmail(email);
        getAgeTextBox().clear();
        inputAge(age);
        getSalaryTextBox().clear();
        inputSalary(salary);
        getDepartmentTextBox().clear();
        inputDepartment(department);
        clickSubmitButton();
    }

    public void clickDeleteButton(int row){
        getDriver().findElement(By.id("delete-record-" + row)).click();
    }

    /*public List<WebElement> getTableRow(){
        List<WebElement> records = getTableBody().findElements(By.className("rt-tr"));
        return records;
    }

    public boolean checkIfEntityIsInTable(String firstName, String lastName, String email, String age,
                                          String salary, String department){
        List<WebElement> newRow = getTableRow().findElements(By.tagName("div"));
        String firstNameData = newRow.get(0).getText();
        String lastNameData = newRow.get(1).getText();
        String ageData = newRow.get(2).getText();
        String emailData = newRow.get(3).getText();
        String salaryData = newRow.get(4).getText();
        String departmentData = newRow.get(5).getText();
        if (firstNameData.equals(firstName) && lastNameData.equals(lastName) && ageData.equals(age)
                && emailData.equals(email) && salaryData.equals(salary) && departmentData.equals(department)){
            return true;
        }
        return false;
    }*/


}
