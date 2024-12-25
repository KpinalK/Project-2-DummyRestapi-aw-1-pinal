package com.restapi.dummy.employeeinfo;

import com.restapi.dummy.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployeeTest extends TestBase {

    @Test
    public void deleteTheEmployee(){

        given().log().all()
                .header("cookie","humans_21909=1")
                .pathParam("id",2)
                .when()
                .delete("/{id}")
                .then().log().all()
                .statusCode(200);
    }
}
