package by.itacademy.hw17.task1.exception;

public class WrongLoginException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WrongLoginException(String message) {
	super(message);

    }
}