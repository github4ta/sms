package net.javaguides.api;

import net.javaguides.api.service.StudentService;
import net.javaguides.api.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiStudentTest {
    StudentService studentService;

    @Test
    public void postResponseCodeCreateNewStudent() {
        studentService = new StudentService();
        Assert.assertEquals(Utils.codeOK, studentService.postAddNewStudent());
    }

    @Test
    public void getResponseCodeStudents() {
        studentService = new StudentService();
        Assert.assertEquals(Utils.codeOK, studentService.getStudents());

    }
}
