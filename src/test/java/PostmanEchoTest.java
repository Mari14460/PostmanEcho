import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("Marina")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Marina"));
    }
}
