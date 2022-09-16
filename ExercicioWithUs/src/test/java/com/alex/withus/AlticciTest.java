package com.alex.withus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class AlticciTest {
    Alticci alticciClass = new Alticci();

    //Check if alticci sequence of 10 is equal to 9
    @Test
    public void testAlticciEndpoint() throws NegativeNumberException {
        long num = 10;
        given()
                .pathParam("n", num)
                .when().get("alticci/{n}")
                .then()
                .statusCode(200)
                .body(is("9"));
    }

    @Test
    public void testAlticciEndpointNegativeNumber() throws NegativeNumberException {
        long num = -1;
        given()
                .pathParam("n", num)
                .when().get("alticci/{n}")
                .then()
                .statusCode(400)
                .body(is("Number must be equal or greater than zero"));
    }

}