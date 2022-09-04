package by.itacademy.hw11.task1;

public class Registration {

	public boolean verify() {

		User user = null;

		try {
			user = Validation.newUser();
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());

		}

		if (user != null) {

			try {
				AddUser newUser = new AddUser();
				newUser.addUser(user);
			} catch (WrongLoginException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}
}
