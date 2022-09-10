package by.itacademy.hw11.task1;

public class Authorization {

    public boolean checkUser() {

	try {
	    User user = new Validation().newUser();
	    AddUser newUser = new AddUser();
	    return newUser.checkUser(user);

	} catch (WrongLoginException | WrongPasswordException | UserNotExistException e) {
	    System.out.println(e.getMessage());

	}
	return false;
    }

}
