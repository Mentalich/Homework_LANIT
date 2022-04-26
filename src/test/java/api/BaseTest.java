package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import model.AuthToken;
import model.Status;
import model.Ticket;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static io.restassured.RestAssured.given;

/** Абстрактный класс, содержащий общие для всех тестов методы */
public abstract class BaseTest {
    @BeforeClass
    public void prepare() throws IOException {
        // todo: загрузить в системные переменные "base.uri" из "config.properties"
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("base.url"));

        String baseUri = System.getProperty("base.uri");
        if (baseUri == null || baseUri.isEmpty()) {
            throw new RuntimeException("В файле \"config.properties\" отсутствует значение \"base.uri\"");
        }

        // todo: подготовить глобальные преднастройки для запросов
        RestAssured.requestSpecification=new RequestSpecBuilder()
                .setBaseUri("https://at-sandbox.workbench.lanit.ru/")
                .addHeader("api_key",System.getProperty("api_key"))
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        RestAssured.filters(new ResponseLoggingFilter());
    }

    protected AuthToken login() {
        // todo: отправить запрос на получения токена, используя учетные данные из "config.properties"
        return null;
    }

    protected Ticket buildNewTicket(Status status, int priority) {
        // todo: создать объект с тестовыми данными
        Ticket ticket=new Ticket(status, priority);
        ticket.setId(250299);
        ticket.setDue_date("string");
        ticket.setAssigned_to("string");
        ticket.setTitle("string");
        ticket.setCreated("string");
        ticket.setModified("string");
        ticket.setSubmitter_email("string");
        ticket.setOn_hold(true);
        ticket.setDescription("string");
        ticket.setResolution("string");
        ticket.setLast_escalation("string");
        ticket.setSecret_key("string");
        ticket.setQueue(1);
        ticket.setKbitem(1);
        ticket.setMerged_to(1);
        return ticket;
    }

    protected Ticket createTicket(Ticket ticket) {
        // todo: отправить HTTP запрос для создания тикета
        given()
                .body(ticket)
                    .when()
                        .post("/api_tickets")
                    .then().statusCode(201);
        return ticket;
    }
}
