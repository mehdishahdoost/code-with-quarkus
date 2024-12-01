package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ArtistsResourceTest {


    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/artists")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .body("$.size()", is(3));
    }

}