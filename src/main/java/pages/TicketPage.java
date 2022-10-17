package pages;

import io.qameta.allure.Step;
import models.Dictionaries;
import models.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Страница отдельного тикета (авторизированный пользователь) */
public class TicketPage extends HelpdeskBasePage {

    /* Верстка страницы может измениться, поэтому для таблиц вместо индексов строк и столбцов лучше использовать
       более универсальные локаторы, например поиск по тексту + parent, following-sibling и другие.

       Текст тоже может измениться, но в этом случае элемент не будет найден и тест упадет,
       а ошибку можно будет легко локализовать и исправить.
       В случае изменений ячеек таблицы, локатор будет продолжать работать, но будет указывать на другой элемент,
       поведение теста при этом изменится непредсказуемым образом и ошибку будет сложно найти. */
    private WebElement dueDate = driver.findElement(By.xpath("//th[text()='Due Date']/following-sibling::td[1]"));
    private WebElement email=driver.findElement(By.xpath("//th[text()='Submitter E-Mail']/following-sibling::td[1]"));
    private WebElement priority=driver.findElement(By.xpath("//th[text()='Priority']/following-sibling::td[1]"));
    private WebElement header=driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div[1]/div/div/table/thead/tr/th"));
    private WebElement description=driver.findElement(By.xpath("//*[@id=\"ticket-description\"]"));

    Pattern DatePattern = Pattern.compile("... \\d+, \\d+, \\d+:\\d+");
    Matcher matcher;
    Pattern TitleMatcher = Pattern.compile("(.+\\. )(.+)( \\[)");
    Pattern QueueMatcher = Pattern.compile("Queue: (.+)");

    @Step("Проверить значение полей на странице тикета")
    public void checkTicket(Ticket ticket) {
        matcher = TitleMatcher.matcher(header.getText());
        matcher.find(); Assert.assertEquals(ticket.getTitle(), matcher.group(2));
        matcher = QueueMatcher.matcher(header.getText());
        matcher.find(); Assert.assertEquals("Queue: "+ Dictionaries.getQueue(ticket.getQueue()),matcher.group());
        matcher = DatePattern.matcher(dueDate.getText());
        matcher.find(); Assert.assertEquals(ticket.getDue_dateTesting(), matcher.group());
        Assert.assertEquals(Dictionaries.getPriority(ticket.getPriority()), priority.getText());
        Assert.assertEquals(ticket.getSubmitter_email(), email.getText());
        Assert.assertEquals("Description\n"+ticket.getDescription(),description.getText());
    }
}
