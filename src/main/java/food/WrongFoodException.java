package food;

public class WrongFoodException extends Throwable {

    public WrongFoodException(String message) {
        super(message);
    }
}