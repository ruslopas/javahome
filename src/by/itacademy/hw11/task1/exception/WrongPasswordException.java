package by.itacademy.hw11.task1.exception;

public class WrongPasswordException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WrongPasswordException(String message) {
	super(message);

    }

}
