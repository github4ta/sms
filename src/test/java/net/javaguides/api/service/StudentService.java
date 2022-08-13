package net.javaguides.api.service;

import net.javaguides.api.specification.Specifications;
import net.ui.utils.RandomValueStudent;
import static io.restassured.RestAssured.given;

public class StudentService {

    public int postAddNewStudent() {
        Specifications.installSpecification(Specifications.requestSpecification(),
                Specifications.responseSpecificationOk());
        return given()
                .queryParam("firstName", RandomValueStudent.STUDENT_NAME)
                .queryParam(" lastName", RandomValueStudent.STUDENT_LAST_NAME)
                .queryParam("email", RandomValueStudent.STUDENT_EMAIL)
                .post()
                .then()
                .log()
                .all()
                .extract()
                .statusCode();

    }

    public int getStudents() {
        Specifications.installSpecification(Specifications.requestSpecification(),
                Specifications.responseSpecificationOk());
        return given()
                .get()
                .then()
                .log()
                .all()
                .extract()
                .statusCode();
    }

}
