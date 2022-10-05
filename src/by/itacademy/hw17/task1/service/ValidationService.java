package by.itacademy.hw17.task1.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.itacademy.hw17.task1.entity.User;
import by.itacademy.hw17.task1.exception.WrongLoginException;
import by.itacademy.hw17.task1.exception.WrongPasswordException;

public class ValidationService {

    private static final String LOGIN = "^(([a-zA-Z0-9]+)(_([a-zA-Z0-9]+))*){5,20}$";
    private static final String PASSWORD = "^[a-zA-Z0-9_]{8,}$";

    public static User newUser() throws WrongLoginException, WrongPasswordException {

	Pattern pattern;
	Matcher matcher;

	System.out.println("Enter login :");
	String login = ConsoleInputService.input();
	pattern = Pattern.compile(LOGIN);
	matcher = pattern.matcher(login);
	if (!matcher.matches())
	    throw new WrongLoginException("Wrong login.Try again please");

	System.out.println("Enter password :");
	String password = ConsoleInputService.input();
	pattern = Pattern.compile(PASSWORD);
	matcher = pattern.matcher(password);
	if (!matcher.matches())
	    throw new WrongPasswordException("Wrong password.Try again please");

	return new User(login, password);
    }

}
