package by.itacademy.hw11.task1.service;

import by.itacademy.hw11.task1.entity.User;
import by.itacademy.hw11.task1.exception.UserNotExistException;
import by.itacademy.hw11.task1.exception.WrongLoginException;
import by.itacademy.hw11.task1.exception.WrongPasswordException;

public class Authorization {

    public boolean checkUser() {

	try {
	    new ValidationService();
	    User user = ValidationService.newUser();
	    AddUser newUser = new AddUser();
	    return newUser.checkUser(user);

	} catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
	    System.out.println(e.getMessage());

	}
	return false;
    }

}