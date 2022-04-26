package api;

import model.Status;
import model.Ticket;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/** Создание и проверка тикета */
public class CreateTicketTest extends BaseTest {

    @Test
    public void createTicketTest() {
        // todo: создать тикет и проверить, что он находится в системе
        createTicket(buildNewTicket(Status.OPEN,3));

    }

    protected Ticket getTicket(int id) {
        // todo: отправить HTTP запрос на получение тикета по его id
        given()
                .body(id)
                .when()
                    .get("/api_tickets_read")
                .then().statusCode(200);
        return null;
    }
}
