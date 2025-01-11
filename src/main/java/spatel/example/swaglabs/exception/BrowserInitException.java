package spatel.example.swaglabs.exception;

public class BrowserInitException extends RuntimeException {

    public BrowserInitException(String message) {
        super(message);
    }

    public BrowserInitException(String message, Throwable cause) {
        super(message, cause);
    }
}
