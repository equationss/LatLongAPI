package LatLongAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class ReverseGeocode {

    @Test
    public void Reverse_Geocode(){

        String Lat = "51.50344025";
        String Lon = "-0.12770820958562096";
        String Token = "pk.b83f399b5448d4830f7b224c54b9a42a";

        // Sending the request and getting the response
        baseURI= "https://us1.locationiq.com";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("/v1/reverse?key=" + Token + "&lat=" + Lat + "&lon=" +Lon + "&format=json").then().statusCode(200).log().all();

    }
}
