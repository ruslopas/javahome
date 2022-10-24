package by.itacademy.hw3;

import java.util.Scanner;

//Check number for even-odd

public class Task1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

	checkEvenOrOdd(inputFromScanner());

    }

    public static void checkEvenOrOdd(int num) {

	if (num % 2 != 0) {

	    System.out.printf("%s нечетное число", num);

	} else {

	    System.out.printf("%s четное число", num);
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

	int num = scanner.nextInt();

	return num;

    }
}