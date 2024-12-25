package com.restapi.dummy.employeeinfo;

import com.restapi.dummy.model.EmployeePojo;
import com.restapi.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostEmployeeTest extends TestBase {

    @Test
    public void createEmployee(){

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("test");
        employeePojo.setSalary("123");
        employeePojo.setAge("23");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .header("cookie","humans_21909=1")
                .when()
                .body(employeePojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
