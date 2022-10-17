package api;

import model.Status;
import model.Ticket;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/** Создание и проверка тикета */
public class CreateTicketTest extends BaseTest {

    @Test
    public void createTicketTest() {
        // todo: создать тикет и проверить, что он находится в системе
        Ticket ticket = createTicket(buildNewTicket(Status.OPEN,3));
        Ticket ticketActual=getTicket(ticket.getId());
        Assert.assertEquals(ticket.getId(), ticketActual.getId());
        Assert.assertEquals(ticket.getQueue(), ticketActual.getQueue());
        Assert.assertEquals(ticket.getPriority(), ticketActual.getPriority());
        Assert.assertEquals(ticket.getTitle(),ticketActual.getTitle());
        Assert.assertEquals(ticket.getDescription(),ticketActual.getDescription());
    }

    protected Ticket getTicket(int id) {
        // todo: отправить HTTP запрос на получение тикета по его id
        return given()
                .header("Authorization","Token "+ login().getToken())
                .pathParams("id",id)
                .get("/api/tickets/{id}")
                .then()
                .extract()
                .as(Ticket.class);
    }
}
