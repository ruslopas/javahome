package by.itacademy.hw17.task1.service;

import java.util.Scanner;

public class ConsoleInputService {

    public static String input() {

	Scanner input = new Scanner(System.in);

	return input.nextLine();
    }
}
