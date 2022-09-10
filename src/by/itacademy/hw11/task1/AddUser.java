package by.itacademy.hw11.task1;

public class AddUser {

    final UserRepository users = UserRepository.getInstance();

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

	return true;
    }

}
