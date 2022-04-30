package api;

import io.restassured.response.Response;
import model.Status;
import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/** Обновление тикета */
public class UpdateTicketTest extends BaseTest {

    @Test (expectedExceptions = AssertionError.class)
    public void updateTicketTest() {
        // todo: создать тикет со статусом Closed, затем обновить тикет и проверить сообщение об ошибке (негативный сценарий)
        Ticket ticket=createTicket(buildNewTicket(Status.CLOSED, 1));
        updateTicketNegative(ticket);
    }

    private void updateTicketNegative(Ticket ticket) {
        // todo: отправить HTTP запрос для обновления данных тикета и сразу же проверить статус код (должен соответствовать ошибке)
        Ticket ticket1=buildNewTicket(Status.OPEN,1);
        Response response=(Response) given()
                .header("Authorization","Token "+ login().getToken())
                .pathParams("id",ticket.getId())
                .body(ticket1)
                .when()
                .patch("/api/tickets{id}");
        Assert.assertEquals(response.getStatusCode(),422);
    }
}
