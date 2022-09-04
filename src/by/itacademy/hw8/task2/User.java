package by.itacademy.hw8.task2;

public class User {
	private final String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public void getQuery() {
		Query newQuery = new Query();
		newQuery.printToLog();

	}

	private class Query {
		public void printToLog() {
			System.out.printf("User \"%s\" with password \"%s\" sent request", login, password);
		}
	}

}
