package com.restapi.dummy.employeeinfo;

import com.restapi.dummy.model.EmployeePojo;
import com.restapi.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutEmployeeTest extends TestBase {

    @Test
    public void updateEmployee(){

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("test");
        employeePojo.setSalary("123");
        employeePojo.setAge("23");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .header("cookie","humans_21909=1")
                .pathParam("id",21)
                .when()
                .body(employeePojo)
                .put("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
