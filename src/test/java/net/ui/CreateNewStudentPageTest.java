package net.ui;

import net.ui.pages.CreateNewStudentPage;
import net.ui.pages.StudentsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewStudentPageTest extends BaseTest {
    CreateNewStudentPage createNewStudentPage;

    @BeforeMethod
    public void openCreateNewStudentPage() {
        createNewStudentPage = new StudentsPage()
                .openPage()
                .clickButtonAddStudent();
    }

    @Test
    public void testTitleNameFormAddStudentPage() {
        Assert.assertEquals("Create New Student", createNewStudentPage.getTitleNameFormAddStudentPage());
    }

    @Test
    public void testLabelFirstNameFormAddStudentPage() {
        Assert.assertEquals("Student First Name", createNewStudentPage.getLabelFirstNameFormAddStudentPage());
    }

    @Test
    public void testLabelLastNameFormAddStudentPage() {
        Assert.assertEquals("Student Last Name", createNewStudentPage.getLabelLastNameFormAddStudentPage());
    }

    @Test
    public void testLabelEmailFormAddStudentPage() {
        Assert.assertEquals("Student Email", createNewStudentPage.getLabelEmailFormAddStudentPage());
    }

    @Test
    public void testIsDisplayedButtonSubmit() {
        Assert.assertTrue(createNewStudentPage.isDisplayedButtonSubmit());
    }
}
