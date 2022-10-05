package by.itacademy.hw17.task1.service;

import java.time.LocalDateTime;

import by.itacademy.hw17.task1.datasource.UserRepository;
import by.itacademy.hw17.task1.entity.User;
import by.itacademy.hw17.task1.exception.UserNotExistException;
import by.itacademy.hw17.task1.exception.WrongLoginException;
import by.itacademy.hw17.task1.exception.WrongPasswordException;

public class UserService {

   private final UserRepository users = UserRepository.getInstance();

    public void addUser(User user) throws WrongLoginException {

	if (users.getUsers().containsKey(user.getLogin())) {
	    throw new WrongLoginException("User with this login already exist.");
	}
	users.getUsers().put(user.getLogin(), user);

	System.out.println("Congratulations!!!New user successfully add.");
    }

    public boolean checkUser(final User user) throws UserNotExistException, WrongPasswordException {

	if (!users.getUsers().containsKey(user.getLogin()))
	    throw new UserNotExistException("Error! No such user.Try again please.");
	
	User userPassword = users.getUsers().get(user.getLogin());
	
	if (!userPassword.getPassword().equals(user.getPassword()))
	    throw new WrongPasswordException("Error! Wrong password.Try again please.");
	user.setLastAuthorizationDate(LocalDateTime.now());
	return true;
    }

}
