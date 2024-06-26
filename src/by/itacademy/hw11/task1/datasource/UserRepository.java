package by.itacademy.hw11.task1.datasource;

import java.util.HashMap;
import java.util.Map;

import by.itacademy.hw11.task1.entity.User;

public class UserRepository {

    private final Map<String, User> users = new HashMap<>();
    private static volatile UserRepository instance;

    public static UserRepository getInstance() {
	if (instance == null) {
	    instance = new UserRepository();
	}
	return instance;
    }

    private UserRepository() {

	users.put("ruslopas", new User("ruslopas", "12345678"));

    }

    public Map<String, User> getUsers() {
	return users;
    }
}
