package by.itacademy.hw17.task1;

import java.util.Scanner;
import by.itacademy.hw17.task1.service.Authorization;
import by.itacademy.hw17.task1.service.DateTimeService;
import by.itacademy.hw17.task1.service.Registration;

public class Main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	String button = "";
	System.out.println("     *Welcome to the login and password validation program*");

	while (!button.equalsIgnoreCase("q")) {

	    System.out.println("[1] Register login and password\n"
	                     + "[2] Authorization\n"
		             + "[3] Search user by date\n"
		             + "[Q] Exit program");
	    
	    button = input.nextLine().toLowerCase();
	    
	    switch (button) {
	    case "1":
		new Registration().verify();
		break;
	    case "2":
		if (new Authorization().checkUser())
		    System.out.println("Authorization successfully done!");
		break;
	    case "3":
		DateTimeService search = new DateTimeService();
		System.out.println(search.searchUsersByDate().toString());
		break;
	    case "q":
		System.out.println("Thank you.Have a nice day.\nProgram terminated.");
		break;
	    default:
		break;
	    }
	    

	}

    }

}
