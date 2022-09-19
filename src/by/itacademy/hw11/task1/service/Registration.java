package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.entity.User;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;

public class Registration {

    public void verify() {

	User user = null;

	try {
	    user = ValidationService.newUser();
	} catch (WrongLoginException | WrongPasswordException e) {
	    System.out.println(e.getMessage());

	}

	if (user != null) {

	    try {
		UserService newUser = new UserService();
		newUser.addUser(user);
	    } catch (WrongLoginException e) {
		System.out.println(e.getMessage());
	    }
	}

    }
}
