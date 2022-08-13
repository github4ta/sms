package net.ui;

import net.ui.pages.StudentsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentsPageTest extends BaseTest {
    StudentsPage student;

    @BeforeMethod
    public void openStudentsPage() {
        student = new StudentsPage();
        student.openPage();
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("Student Management System", student.getTitleStudentPage());
    }

    @Test
    public void testTitleTableStident() {
        Assert.assertEquals("List Students", student.getTitleStudentTableStudentPage());
    }

    @Test
    public void testNameTableStudent() {
        Assert.assertEquals("Student First Name", student.getFirstNameStudentColumnTable());
    }

    @Test
    public void testLastNameTableStudent() {
        Assert.assertEquals("Student Last Name", student.getLastNameStudentColumnTable());
    }

    @Test
    public void testEmailTableStudent() {
        Assert.assertEquals("Student Email", student.getEmailStudentColumnTable());
    }

    @Test
    public void testActionsTableStudent() {
        Assert.assertEquals("Actions", student.getActionStudentColumnTable());
    }

    @Test
    public void testIsDisplayedLineInfoColumnTable() {
        Assert.assertTrue(student.isDisplayedLineInfoColumnTable());
    }

    @Test
    public void testIsDisplayedButtonUpdate() {
        Assert.assertTrue(student.isDisplayedButtonUpdate());
    }

    @Test
    public void testIsDisplayedButtonDelete() {
        Assert.assertTrue(student.isDisplayedButtonDelete());
    }
}
