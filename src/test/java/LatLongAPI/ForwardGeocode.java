package LatLongAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ForwardGeocode {

    @Test
    public void Forward_Geocode(){

        String address = "221b, Baker St, London";
        String Token = "pk.b83f399b5448d4830f7b224c54b9a42a";

        // Sending the request and getting the response
        baseURI= "https://us1.locationiq.com/";
        given().
                // Asserting the status code to be 200 for successful creation
                        get("v1/search?key=" +Token + "&q="+ address +"&format=json").then().statusCode(200).log().all();





    }

}
