package by.itacademy.hw17.task1.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import by.itacademy.hw17.task1.datasource.UserRepository;

public class DateTimeService {

    private final UserRepository users = UserRepository.getInstance();

    public List<String> searchUsersByDate() {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm");

	System.out.print("Enter start date in format \"dd/mm/yyyy hh/mm\": ");
	LocalDateTime dateStart = LocalDateTime.parse(ConsoleInputService.input(), formatter);

	System.out.print("Enter end date in format \"dd/mm/yyyy hh/mm\": ");
	LocalDateTime dateEnd = LocalDateTime.parse(ConsoleInputService.input(), formatter);
	
	if (users.getUsers().isEmpty()) {
	    System.out.println("There is no registered users in database.");
	}
	
	return users.getUsers().entrySet().stream()
		                          .filter(user -> user.getValue()
		                          .getRegistrationDate().isAfter(dateStart)
			                  && user.getValue()
			                  .getRegistrationDate().isBefore(dateEnd))
		                          .map(user -> user.getKey())
		                          .collect(Collectors.toList());

    }

}
