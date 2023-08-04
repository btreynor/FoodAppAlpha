package exception;

public class OrderAlreadyFinishedException extends Exception {

    public OrderAlreadyFinishedException(String message) {
        super(message);
    }
}
