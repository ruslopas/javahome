package by.itacademy.hw11.task1.service;

import java.util.Scanner;

public class ConsoleInputService {

    public static String input() {

	Scanner input = new Scanner(System.in);

	return input.next();
    }
}
