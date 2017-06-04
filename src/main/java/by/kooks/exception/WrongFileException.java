
public class WrongFileException extends Exception{
    public WrongFileException() {
    }
    public WrongFileException(String message, Throwable exception) {
        super(message, exception);
    }
    public WrongFileException(String message) {
        super(message);
    }
    public WrongFileException(Throwable exception) {
        super(exception);
    }
}
