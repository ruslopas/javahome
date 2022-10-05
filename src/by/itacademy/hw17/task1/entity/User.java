package by.itacademy.hw17.task1.entity;

import java.time.LocalDateTime;

public class User {

    private String login;
    private String password;
    private final LocalDateTime registrationDate = LocalDateTime.now();
    private LocalDateTime lastAuthorizationDate;

    public User(String login, String password) {

	this.login = login;
	this.password = password;
    }

    public String getLogin() {
	return login;
    }

    public String getPassword() {
	return password;
    }

    public LocalDateTime getRegistrationDate() {
	return registrationDate;
    }

    public LocalDateTime getLastAuthorizationDate() {
	return lastAuthorizationDate;
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }
   
	
    
}
