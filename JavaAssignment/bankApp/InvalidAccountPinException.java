package bankApp;

public class InvalidAccountPinException extends RuntimeException {
    public InvalidAccountPinException(String message) {
        super(message);
    }

}
