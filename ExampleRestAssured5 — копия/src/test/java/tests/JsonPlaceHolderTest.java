package tests;

import org.testng.annotations.Test;

import static constans.Constans.Actions.JSONPLACEHOLDER_POST;
import static io.restassured.RestAssured.given;

public class JsonPlaceHolderTest {
    @Test
    public void postWithXML(){
        String postBodyXML = "<Company>\n" +
                "  <Employee>\n" +
                "      <FirstName>Tanmay</FirstName>\n" +
                "      <LastName>Patil</LastName>\n" +
                "      <ContactNo>1234567890</ContactNo>\n" +
                "      <Email>tanmaypatil@xyz.com</Email>\n" +
                "      <Address>\n" +
                "           <City>Bangalore</City>\n" +
                "           <State>Karnataka</State>\n" +
                "           <Zip>560212</Zip>\n" +
                "      </Address>\n" +
                "  </Employee>\n" +
                "</Company>";

        given().body(postBodyXML).log().all().
                when().post("").
                then().log().body().statusCode(200);
    }

    @Test
    public void postWithJson(){
        String postBodyJSON = "{\n" +
                "      \"title\": \"foo\",\n" +
                "      \"body\": \"bar\",\n" +
                "      \"userId\": 1\n" +
                "    }";

        given().body(postBodyJSON).log().uri().
                when().post("").
                then().log().body().statusCode(201);
    }
}
