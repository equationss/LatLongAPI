package LatLongAPI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ReverseGeocodeFail {

    @Test
    public void Reverse_Geocode() {
        String Lat = "51.50344025";
        String Lon = "-0.12770820958562096";
        String Token = "b83f399b5448d4830f7b224c54b9a42a";

        // Set the base URI
        baseURI = "https://us1.locationiq.com";

        // Send the request and get the response
        Response response = given()
                .get("/v1/reverse?key=" + Token + "&lat=" + Lat + "&lon=" + Lon + "&format=json");

        // Assert the status code
        response.then().statusCode(401).log().all();

        // Validate specific elements in the JSON response
        response.then()
                .body("error", equalTo("Invalid key"));
    }
}

