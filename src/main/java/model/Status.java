package model;

/**  Статусы тикета, используемые в тестах */
public enum Status {
    OPEN(1),
    RESOLVED(2),
    REOPENED(3),
    CLOSED(4),
    DUPLICATE(5);

    private final int code;

    Status(int code) {
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
