package by.itacademy.hw8.task2;

public class Main {
	/*
	 * Пользователь имеет логин и пароль и содержит внутренний класс Query,
	 * представляющий собой запрос пользователя к системе. Запрос содержит метод
	 * printToLog(), который распечатывает сообщение о том, что пользователь с
	 * таким-то логином и паролем отправил запрос.
	 */
	public static void main(String[] args) {
		User vasya = new User("Vasya","12345");
		vasya.new Query().printToLog();
		

	}

}
