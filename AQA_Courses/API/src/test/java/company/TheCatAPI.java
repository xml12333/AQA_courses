package company;

import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class TheCatAPI {
    @BeforeClass
    public static void setUp() {

        // First step - set up the base URI
        baseURI = "https://api.thecatapi.com";
    }

    @Test
    public void getCatBreeds() {
        given().
                header("x-api-key", "DEMO-API-KEY").
                when().
                get("/v1/breeds").
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();
    }

    @Test
    public void createVote() {
        final String body = "{\n" +
                "  \"image_id\": \"asf2\",\n" +
                "  \"sub_id\": \"my-user-1234\",\n" +
                "  \"value\": 1\n" +
                "}";
        given().
                header("x-api-key", "DEMO-API-KEY").
                header("content-type", "application/json").
                body(body).
                when().
                post("/v1/votes").
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();
    }

    @Test
    public void getVotes() {
        given().
                header("x-api-key", "DEMO-API-KEY").
                when().
                get("/v1/votes").
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();
    }

    @Test
    public void deleteVote() {
        given().
                header("x-api-key", "DEMO-API-KEY").
                when().
                delete("/v1/votes/{vote_id}", 31098).
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();

//        System.out.println(a);
    }
}
