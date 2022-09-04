package by.itacademy.hw11.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static User newUser() throws WrongLoginException, WrongPasswordException {

		Pattern pattern;
		Matcher matcher;

		System.out.println("Enter login :");
		String login = input();
		pattern = Pattern.compile("^(([a-zA-Z0-9]+)(_([a-zA-Z0-9]+))*){5,20}$");
		matcher = pattern.matcher(login);
		if (!matcher.matches())
			throw new WrongLoginException("Wrong login.Try again please");

		System.out.println("Enter password :");
		String password = input();
		pattern = Pattern.compile("^[a-zA-Z0-9_]{8,}$");
		matcher = pattern.matcher(password);
		if (!matcher.matches())
			throw new WrongPasswordException("Wrong password.Try again please");

		return new User(login, password);
	}

	public static String input() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}

}
