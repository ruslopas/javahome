package by.itacademy.hw14.task1;

import java.util.Scanner;

public class ScannerService {

    static int count;
    static String quit;
    static Scanner scanner = new Scanner(System.in);

    public static int getCount() {

	System.out.println("Введите задержку вывода времени для *ClockDaemon* в секундах.");

	while (!scanner.hasNextInt()) {

	    System.out.println("Это не целое число.Попробуйте ещё раз.");

	    scanner.next();
	}

	count = scanner.nextInt();

	return count;
    }

    public static String getQuit() {

	quit = scanner.nextLine().toLowerCase();

	return quit;
    }
}
