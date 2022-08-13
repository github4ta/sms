package net.ui.pages;

import net.ui.utils.Constants;
import org.openqa.selenium.By;

public class StudentsPage extends BasePage {
    private static final By ADD_STUDENT_BUTTON_LOCATOR = By.xpath("//a[@class='btn btn-primary btn-sm mb-3']");
    private static final By TITLE_TABLE_STUDENTS_LOCATOR = By.xpath("//div[@class='row']/h1 ");
    private static final By FIRST_NAME_STUDENT_COLUMN_TABLE_LOCATOR = By.xpath("//th[contains(text(), 'Student First Name')]");
    private static final By LAST_NAME_STUDENT_COLUMN_TABLE_LOCATOR = By.xpath("//th[contains(text(), ' Student Last Name')]");
    private static final By EMAIL_STUDENT_TABLE_COLUMN_LOCATOR = By.xpath(" //th[contains(text(), ' Student Email ')]");
    private static final By ACTION_STUDENT_TABLE_COLUMN_LOCATOR = By.xpath(" //th[contains(text(), ' Actions ')]");
    private static final By LINE_INFO_STUDENT_TABLE_LOCATOR = By.xpath("//tbody/tr[1]");
    private static final By UPDATE_BUTTON_TABLE_LOCATOR = By.xpath("//a[@class='btn btn-primary']");
    private static final By DELETE_BUTTON_TABLE_LOCATOR = By.xpath("//a[@class='btn btn-danger']");

    public StudentsPage openPage() {
        driver.get(Constants.BASE_URL);
        return this;
    }
    public CreateNewStudentPage clickButtonAddStudent() {
        driver.findElement((ADD_STUDENT_BUTTON_LOCATOR)).click();
        return new CreateNewStudentPage();
    }

    public String getTitleStudentPage() {
        return driver.getTitle();
    }

    public String getTitleStudentTableStudentPage() {
        return driver.findElement(TITLE_TABLE_STUDENTS_LOCATOR).getText();
    }

    public String getFirstNameStudentColumnTable() {
        return driver.findElement(FIRST_NAME_STUDENT_COLUMN_TABLE_LOCATOR).getText();
    }

    public String getLastNameStudentColumnTable() {
        return driver.findElement(LAST_NAME_STUDENT_COLUMN_TABLE_LOCATOR).getText();
    }

    public String getEmailStudentColumnTable() {
        return driver.findElement(EMAIL_STUDENT_TABLE_COLUMN_LOCATOR).getText();
    }

    public String getActionStudentColumnTable() {
        return driver.findElement(ACTION_STUDENT_TABLE_COLUMN_LOCATOR).getText();
    }

    public boolean isDisplayedLineInfoColumnTable() {
        return driver.findElement(LINE_INFO_STUDENT_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedButtonUpdate() {
        return driver.findElement(UPDATE_BUTTON_TABLE_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedButtonDelete() {
        return driver.findElement(DELETE_BUTTON_TABLE_LOCATOR).isDisplayed();
    }
}
