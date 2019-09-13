package ctdev;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.regex.Matcher;

public class TestPet {

    @Test
    public void petTest() {
        String idTestVAlue = RandomStringUtils.randomNumeric(5);
        RestAssured.given().baseUri("http://petstore.swagger.io")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "qwerty")
                .body("{\n" +
                        " \"id\": " + idTestVAlue + ",\n" +
                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\":  [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
               // .body(Matchers.equalTo(Integer.valueOf(idTestVAlue));
                .extract().response()
                .prettyPrint();
    }
}
