
public class InvalidDataException extends Exception {

    public InvalidDataException() {
    }
    public InvalidDataException(String message, Throwable exception) {
        super(message, exception);
    }
    public InvalidDataException(String message) {
        super(message);
    }
    public InvalidDataException(Throwable exception) {
        super(exception);
    }
    }
