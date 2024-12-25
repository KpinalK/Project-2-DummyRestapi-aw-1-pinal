package com.restapi.dummy.employeeinfo;

import com.restapi.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeTest extends TestBase {

    @Test
    public void getAllEmployees(){
        Response response = given()
                .header("cookie", "humans_21909=1")
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void getEmployeeID(){
        Response response = given()
                .header("cookie","humans_21909=1")
                .pathParam("id",1)
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}
