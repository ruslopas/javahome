package by.itacademy.hw3;

import java.util.Scanner;

/*
Передать на вход программы число,
 если оно нечетное положительное или четное  отрицательное,
 вывести соответствующий текст.
 */
public class Task2 {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

	checkPositiveOrNegative(inputFromScanner());

    }

    public static void checkPositiveOrNegative(int num) {

	if (num > 0 && num % 2 != 0) {
	    System.out.println(num + " нечетное положительное число");

	} else if (num < 0 && num % 2 == 0) {
	    System.out.println(num + " чётное отрицательное число");
	}

    }

    public static int inputFromScanner() {

	System.out.print("Введите целое число : ");

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	while (!scanner.hasNextInt()) {
	    System.out.print(ANSI_RED + "Это не целое число" + ANSI_RESET + "\nПопробуйте ещё раз : ");
	    scanner.next();

	}

	return scanner.nextInt();

    }

}