package models;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ticket {

    private String title;
    private String due_date;
    private String due_dateTesting;
    private File file=null;
    private Integer id;
    private String submitter_email;
    private String description;
    private Integer priority;
    private Integer queue;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubmitter_email() {
        return submitter_email;
    }

    public void setSubmitter_email(String submitter_email) {
        this.submitter_email = submitter_email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDue_date() {
        return due_date;
    }
    public String getDue_dateTesting(){
        return due_dateTesting;
    }

    // обычный сеттер
    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    // перегруженный сеттер, который принимает дату и форматирует её в строку по шаблону
    public void setDue_date(LocalDateTime due_date) {
        this.due_date = due_date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public void setDue_dateTesting(LocalDateTime due_dateTesting) {
        this.due_dateTesting = due_dateTesting.format(DateTimeFormatter.ofPattern("LLL d, YYYY, h:mm").withLocale(Locale.ENGLISH));
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
