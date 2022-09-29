package by.itacademy.hw11.task1.exception;

public class UserNotExistException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserNotExistException(String message) {
	super(message);

    }

}
