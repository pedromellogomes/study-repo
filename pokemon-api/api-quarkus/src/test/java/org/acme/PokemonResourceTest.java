package org.acme;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;

import org.acme.resource.PokemonResource;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
@TestHTTPEndpoint(PokemonResource.class)
class PokemonResourceTest {

    @Test
    void getById() {
        given()
            .when()
            .get("{id}", 1)
            .then()
            .statusCode(HttpStatus.SC_OK);
    }

    @Test
    void getByIdentifier() {
        var identifier = "bulbasaur";

        given()
                .when()
                .get("identifier/{identifier}", identifier)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
