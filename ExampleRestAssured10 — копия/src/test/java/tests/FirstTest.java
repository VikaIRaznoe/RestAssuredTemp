package tests;

import config.TestConfig;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static constans.Constans.Actions.SWAPI_GET_PEOPLE;
import static constans.Constans.Path.SWAPI_PATH;
import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest extends TestConfig {

    @Test
    public void validateXMLSchema(){
        given().log().uri()
        .when().get("https://maps.googleapis.com/maps/api/place/findplacefromtext/xml?key=AIzaSyAzu493vf7nZGFyT7XUJizmVqoiV_xQnM4&input=New York&inputtype=textquery&fields=formatted_address,geometry,icon,name,permanently_closed,photos,place_id,pluce_code,types&language=ru")
                .then().body(matchesXsdInClasspath("xmlSchema.xsd")).log().body();
    }
}
