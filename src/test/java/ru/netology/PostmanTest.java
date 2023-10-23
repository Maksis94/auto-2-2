package ru.netology;

import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanTest {
    @Test
    void shouldReturnObject() {
        given()
            .baseUri("https://postman-echo.com")
                .body("some data")
            .when()
                .post("/post")
            .then()
                .statusCode(200)
                .body("data", equalTo("some data 1"));
    }
}
