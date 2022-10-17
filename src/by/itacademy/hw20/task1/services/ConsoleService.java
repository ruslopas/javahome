package by.itacademy.hw20.task1.services;

import java.util.Scanner;

public class ConsoleService {
    
    public static String input() {
	
	    @SuppressWarnings("resource")
	    Scanner scanner = new Scanner(System.in);
	    
	    return scanner.nextLine();
    }

}
