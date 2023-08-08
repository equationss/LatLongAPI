package LatLongAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ForwardGeocodeFail {

    @Test
    public void Forward_Geocode(){

        String address = "221b";
        String Token = "pk.b83f399b5448d4830f7";

        // Sending the request and asserting the response
        baseURI = "https://us1.locationiq.com/";
        given()
                .get("v1/search?key=" + Token + "&q=" + address + "&format=json")
                .then()
                .statusCode(401)
                .body("error", equalTo("Invalid key"))
                .log().all();
    }
}
