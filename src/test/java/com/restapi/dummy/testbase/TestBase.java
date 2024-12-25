package com.restapi.dummy.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt(){
        RestAssured.baseURI ="https://dummy.restapiexample.com/";
        RestAssured.basePath = "/api/v1";
    }
}
