package com.redhat.training;

<<<<<<< HEAD
=======
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestHTTPEndpoint(SolverResource.class)
public class SolverResourceTest {

<<<<<<< HEAD
=======
    @Test
    public void simpleSum() {
        given()
        .when().get("3+2")
        .then()
            .statusCode(200)
            .body(is("5.0"));
    }

    @Test
    public void simpleMultiplication() {
        given()
        .when().get("3*2")
        .then()
            .statusCode(200)
            .body(is("6.0"));
    }

    @Test
    public void wrongValue() {
        given()
        .when().get("3*a")
        .then()
            .statusCode(Response.Status.BAD_REQUEST.getStatusCode());
    }

>>>>>>> cd26c9ed54c0d8e5c46dbf1be2517a20f4d7f9a1
}
