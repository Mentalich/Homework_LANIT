package model;

public enum Priority {
    CRITICAL(1),
    HIGH(2),
    NORMAL(3),
    LOW(4),
    VERY_LOW(5);

    private final int code;
    Priority(int code) {
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
