package junit.examples;

public class UserNotFoundException extends Exception {

    private static final Long serialVersionUID = 1L;

    public UserNotFoundException(String message) {
        super(message);
    }
}
