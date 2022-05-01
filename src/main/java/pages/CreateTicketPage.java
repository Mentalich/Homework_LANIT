package pages;

import io.qameta.allure.Step;
import models.Dictionaries;
import models.Ticket;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

/** Страница создания тикета */
public class CreateTicketPage extends HelpdeskBasePage {

    // todo: добавить элементам локаторы через @FindBy

    @FindBy(id = "id_queue")
    private WebElement selectQueue;

    @FindBy(id = "id_title")
    private WebElement inputProblem;

    // todo: добавить остальные поля формы
    @FindBy(id = "id_body")
    private WebElement descriptionProblem;
    @FindBy(id = "id_priority")
    private WebElement priorityForm;
    @FindBy(id = "id_due_on")
    private WebElement due_onForm;
    @FindBy(id = "id_attachment")
    private WebElement attachment;
    @FindBy(id = "id_submitter_email")
    private WebElement submitter_email;
    @FindBy(css = "[type='submit']")
    private WebElement submitTicketButton;

    // todo: проинициализировать элементы

    @Step("Создать тикет")
    public CreateTicketPage createTicket(Ticket ticket) {
        setInputProblem(ticket.getTitle());
        setSelectQueue(ticket.getQueue());
        setDescriptionProblem(ticket.getDescription());
        setPriority(ticket.getPriority());
        setDue_onForm(ticket.getDue_date());
        //setAttachment(ticket.getFile)
        setSubmitter_email(ticket.getSubmitter_email());

        clickOnSubmitButton();
        return this;
    }

    @Step("Ввести имя проблемы: {text}")
    public void setInputProblem(String text) {
        inputProblem.sendKeys(text);
    }
    @Step("Определить поле Queue")
    public void setSelectQueue(int queue){
        selectQueue.sendKeys(Dictionaries.getQueue(queue));
    }
    @Step("Ввести summary")
    public void setDescriptionProblem(String description){descriptionProblem.sendKeys(description);}
    @Step("Определяем приоритет")
    public void setPriority(int priority){priorityForm.sendKeys(Dictionaries.getPriority(priority));}
    @Step("Задаём дату")
    public void setDue_onForm(String dueOnForm){due_onForm.sendKeys(dueOnForm);}
    //@Step("Прикрепление файла")
    //public void setAttachment(File file){attachment.;}
    @Step("email отправителя")
    public void setSubmitter_email(String email){submitter_email.sendKeys(email);}

    @Step("Нажать на кнопку создания тикета")
    public void clickOnSubmitButton() {
        submitTicketButton.click();
    }
}
