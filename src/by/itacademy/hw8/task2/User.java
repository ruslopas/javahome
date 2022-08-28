package by.itacademy.hw8.task2;

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	class Query {
		public void printToLog() {
			System.out.println("User \"" + login + "\" with password \"" + password + "\" sent request");
		}
	}
}
